package it.unimi.di.sweng.katamusicamaestro;

public class PlainInstrumentFactory implements InstrumentFactory {

    @Override
    public MusicalInstrument createTrumpet() {
        return new Trumpet();
    }

    @Override
    public MusicalInstrument createHorn() {
        return new Horn();
    }

    @Override
    public MusicalInstrument createWaterGlass() {
        return new WaterGlassMusicalInstrument();
    }

    @Override
    public MusicalInstrument createIronRod() {
        return new GermanPercussionMusicalInstrument(new IronRod());
    }

    // tutta questa catena di costruzioni complesse viene semplificata con il factory

}
