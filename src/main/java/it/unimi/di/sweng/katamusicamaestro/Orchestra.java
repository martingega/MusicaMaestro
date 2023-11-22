package it.unimi.di.sweng.katamusicamaestro;

import java.util.ArrayList;
import java.util.List;

public class Orchestra implements MusicalInstrument {

    private final List<MusicalInstrument> instruments = new ArrayList<>();

    public void add(MusicalInstrument instrument) {
        instruments.add(instrument);
    }

    @Override
    public String play() {
        StringBuilder sb = new StringBuilder();
        for(MusicalInstrument instrument : instruments){
            sb.append(instrument.play());
            sb.append('\n');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
