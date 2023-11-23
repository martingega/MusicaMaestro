package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public abstract class DecoratorMusicalInstrument implements MusicalInstrument {

    // siccome è classe astratta non è obbligata a soddisfare i contratti (potrebbe anche fare nulla)

    private final MusicalInstrument instrument;

    protected DecoratorMusicalInstrument(@NotNull MusicalInstrument instrument){
        this.instrument = instrument;
    }

    @Override
    public @NotNull String play(){
        String ret = instrument.play();
        ret = specificDecoration(ret);
        return ret;
    }

    @NotNull String specificDecoration(@NotNull String original){
        return original;
    }

}
