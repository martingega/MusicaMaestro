package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class SlowTempoMusicalInstrument implements MusicalInstrument {

    private final MusicalInstrument instrument;

    public SlowTempoMusicalInstrument(MusicalInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public @NotNull String play() {
        StringBuilder ret = new StringBuilder();
        String original = instrument.play();
        String VOWELS = "AEIOUaeiou";
        for(String s : original.split("")){
            ret.append(s);
            if(VOWELS.contains(s)) ret.append(s);
        }
        return ret.toString();
    }

}
