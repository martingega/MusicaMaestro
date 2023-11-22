package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class GermanPercussionMusicalInstrument implements MusicalInstrument {

    // Realizza un OBJECT ADAPTER

    private final GermanPercussion germanPercussion;
    public GermanPercussionMusicalInstrument(GermanPercussion germanPercussion) {
        this.germanPercussion = germanPercussion;
    }

    @Override
    public @NotNull String play() {
        return germanPercussion.spiel();
    }

}
