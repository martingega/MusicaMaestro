package it.unimi.di.sweng.katamusicamaestro;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MusicalInstrumentTest {

    @Test
    void testTrumpet(){
        MusicalInstrument SUT = new Trumpet();
        assertThat(SUT.play()).isEqualTo("pepepe");
    }

}