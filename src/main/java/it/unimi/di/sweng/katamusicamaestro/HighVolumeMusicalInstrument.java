package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class HighVolumeMusicalInstrument implements MusicalInstrument {

    private final MusicalInstrument instrument;

    public HighVolumeMusicalInstrument(MusicalInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public @NotNull String play() {
        String ret = instrument.play();
        ret = ret.toUpperCase();
        return ret;
    }

}
