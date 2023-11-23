package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class SlowTempoMusicalInstrument extends DecoratorMusicalInstrument implements MusicalInstrument {


    public SlowTempoMusicalInstrument(@NotNull MusicalInstrument instrument) {
        super(instrument);
    }

    @Override
    @NotNull String specificDecoration(@NotNull String original){
        StringBuilder ret = new StringBuilder();
        String VOWELS = "AEIOUaeiou";
        for(String s : original.split("")){
            ret.append(s);
            if(VOWELS.contains(s)) ret.append(s);
        }
        return ret.toString();
    }

}
