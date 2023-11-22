package it.unimi.di.sweng.katamusicamaestro;

public class GermanPercussionMusicalInstrument implements MusicalInstrument {

    private final GermanPercussion germanPercussion;
    public GermanPercussionMusicalInstrument(GermanPercussion germanPercussion) {
        this.germanPercussion = germanPercussion;
    }

    @Override
    public String play() {
        return germanPercussion.spiel();
    }
}
