package it.unimi.di.sweng.katamusicamaestro;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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

}
