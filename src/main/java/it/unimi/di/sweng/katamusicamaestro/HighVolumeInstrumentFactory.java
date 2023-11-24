package it.unimi.di.sweng.katamusicamaestro;

public class HighVolumeInstrumentFactory implements InstrumentFactory {

    @Override
    public MusicalInstrument createTrumpet() {
        return new HighVolumeMusicalInstrument(new Trumpet());
    }

}
