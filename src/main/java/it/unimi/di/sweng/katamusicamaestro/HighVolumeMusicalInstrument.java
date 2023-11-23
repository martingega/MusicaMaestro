package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class HighVolumeMusicalInstrument extends DecoratorMusicalInstrument implements MusicalInstrument {


    public HighVolumeMusicalInstrument(@NotNull MusicalInstrument instrument) {
        super(instrument);
    }

    @Override
    @NotNull String specificDecoration(@NotNull String original){
        return original.toUpperCase();
    }

}
