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

}
