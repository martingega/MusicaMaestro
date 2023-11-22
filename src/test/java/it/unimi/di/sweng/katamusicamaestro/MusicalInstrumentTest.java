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
}
