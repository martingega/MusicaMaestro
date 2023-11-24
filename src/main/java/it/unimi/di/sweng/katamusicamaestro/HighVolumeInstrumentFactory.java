package it.unimi.di.sweng.katamusicamaestro;

public class HighVolumeInstrumentFactory implements InstrumentFactory {

    @Override
    public MusicalInstrument createTrumpet() {
        return new HighVolumeMusicalInstrument(new Trumpet());
    }

    @Override
    public MusicalInstrument createHorn() {
        return new HighVolumeMusicalInstrument(new Horn());
    }

    @Override
    public MusicalInstrument createWaterGlass() {
        return new HighVolumeMusicalInstrument(new WaterGlassMusicalInstrument());
    }

    @Override
    public MusicalInstrument createIronRod() {
        return new HighVolumeMusicalInstrument(new GermanPercussionMusicalInstrument(new IronRod()));
    }

    // tutta questa catena di costruzioni complesse viene semplificata con il factory

}
