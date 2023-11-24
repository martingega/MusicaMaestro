package it.unimi.di.sweng.katamusicamaestro;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class MusicalInstrumentTest {

    @Test
    void testTrumpet(){
        MusicalInstrument SUT = new Trumpet();
        assertThat(SUT.play()).isEqualTo("pepepe");
    }

    @Test
    void testHorn(){
        MusicalInstrument SUT = new Horn();
        assertThat(SUT.play()).isEqualTo("papapa");
    }

    @Test
    void testWaterGlass(){
        WaterGlass SUT = new WaterGlass();
        assertThat(SUT.tap()).isEqualTo("diding");
    }

    @Test
    void testIronRod(){
        GermanPercussion SUT = new IronRod();
        assertThat(SUT.spiel()).isEqualTo("tatang");
    }

    @Test
    void testWaterGlassMusicalInstruments(){
        MusicalInstrument SUT = new WaterGlassMusicalInstrument();
        assertThat(SUT.play()).isEqualTo("diding");
    }

    @Test
    void testIronRodMusicalInstrument(){
        MusicalInstrument SUT = new GermanPercussionMusicalInstrument(new IronRod());
        assertThat(SUT.play()).isEqualTo("tatang");
    }

    // testAddInOrchestra non fatto perché ritenuto più semplice e costoso (debito tecnico) da testare

    @Test
    void testOrchestra(){

        MusicalInstrument i1 = new Trumpet();
        MusicalInstrument i2 = new Horn();
        MusicalInstrument i3 = new GermanPercussionMusicalInstrument(new IronRod());

        Orchestra SUT = new Orchestra();

        SUT.add(i1);
        SUT.add(i2);
        SUT.add(i3);

        assertThat(SUT.play()).isEqualTo("pepepe\npapapa\ntatang");
    }

    @Test
    void testOrchestraVuota(){
        Orchestra SUT = new Orchestra();
        assertThat(SUT.play()).isEqualTo("");
    }

    @Test
    void testOrchestraDiOrchestra(){
        Orchestra SUT = new Orchestra();
        Orchestra other = new Orchestra();
        SUT.add(new Horn());
        other.add(new Trumpet());
        other.add(new WaterGlassMusicalInstrument());
        SUT.add(other);
        assertThat(SUT.play()).isEqualTo("papapa\npepepe\ndiding");
    }

    @Test
    void testHighVolumeInstruments(){
        MusicalInstrument instrument = mock(MusicalInstrument.class);
        when(instrument.play()).thenReturn("aBcd");
        MusicalInstrument SUT =  new HighVolumeMusicalInstrument(instrument);
        assertThat(SUT.play()).isEqualTo("ABCD");
    }

    @Test
    void testSlowTempoInstruments(){
        MusicalInstrument instrument = mock(MusicalInstrument.class);
        when(instrument.play()).thenReturn("Abcedi");
        MusicalInstrument SUT =  new SlowTempoMusicalInstrument(instrument);
        assertThat(SUT.play()).isEqualTo("AAbceedii");
    }

    @Test
    void testHighVolumeFactory(){
        InstrumentFactory factory = new HighVolumeInstrumentFactory();
        MusicalInstrument i1 = factory.createTrumpet();
        assertThat(i1.play()).isEqualTo("PEPEPE");
    }

    @Test
    void testHighVolumeOrchestra(){
        InstrumentFactory factory = new HighVolumeInstrumentFactory();
        Orchestra orchestra = new Orchestra();
        orchestra.add(factory.createTrumpet());
        orchestra.add(factory.createHorn());
        orchestra.add(factory.createWaterGlass());
        orchestra.add(factory.createIronRod());
        assertThat(orchestra.play()).isEqualTo("PEPEPE\nPAPAPA\nDIDING\nTATANG");
    }

    @Test
    void testPlainOrchestraFactory(){
        InstrumentFactory factory = new PlainInstrumentFactory();
        Orchestra orchestra = new Orchestra();
        orchestra.add(factory.createTrumpet());
        orchestra.add(factory.createHorn());
        orchestra.add(factory.createWaterGlass());
        orchestra.add(factory.createIronRod());
        assertThat(orchestra.play()).isEqualTo("pepepe\npapapa\ndiding\ntatang");
    }

    @Test
    void testSlowTempoOrchestraFactory(){
        InstrumentFactory factory = new SlowTempoInstrumentFactory();
        Orchestra orchestra = new Orchestra();
        orchestra.add(factory.createTrumpet());
        orchestra.add(factory.createHorn());
        orchestra.add(factory.createWaterGlass());
        orchestra.add(factory.createIronRod());
        assertThat(orchestra.play()).isEqualTo("peepeepee\npaapaapaa\ndiidiing\ntaataang");
    }

    @Test
    void testObservable(){
        ObservableMusicalInstrument SUT = new ObservableMusicalInstrument(new Trumpet());
        Observer<String> vicino = mock(Observer.class);
        SUT.register(vicino);
        SUT.play();
        verify(vicino).update("Trumpet");
    }

    @Test
    void testObserver(){
        MusicCritic SUT = new MusicCritic();
        ObservableMusicalInstrument instrument = new ObservableMusicalInstrument(new Trumpet());
        instrument.register(SUT);
        instrument.play();
        instrument.play();
        assertThat(SUT.tellMe()).isEqualTo("Trumpet:2");
    }

    @Test
    void testObserverWithMoreInstruments(){
        MusicCritic SUT = new MusicCritic();
        ObservableMusicalInstrument instrument1 = new ObservableMusicalInstrument(new Trumpet());
        ObservableMusicalInstrument instrument2 = new ObservableMusicalInstrument(new Horn());
        ObservableMusicalInstrument instrument3 = new ObservableMusicalInstrument(new WaterGlassMusicalInstrument());

        instrument1.register(SUT);
        instrument2.register(SUT);
        instrument3.register(SUT);

        instrument1.play();
        instrument2.play();
        instrument3.play();
        instrument2.play();
        instrument2.play();
        instrument3.play();

        assertThat(SUT.tellMe()).isEqualTo("Horn:3\nTrumpet:1\nWaterGlassMusicalInstrument:2");
    }

}
