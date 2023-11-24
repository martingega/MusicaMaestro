package it.unimi.di.sweng.katamusicamaestro;

public class SlowTempoInstrumentFactory implements InstrumentFactory{

        @Override
        public MusicalInstrument createTrumpet() {
            return new SlowTempoMusicalInstrument(new Trumpet());
        }

        @Override
        public MusicalInstrument createHorn() {
            return new SlowTempoMusicalInstrument(new Horn());
        }

        @Override
        public MusicalInstrument createWaterGlass() {
            return new SlowTempoMusicalInstrument(new WaterGlassMusicalInstrument());
        }

        @Override
        public MusicalInstrument createIronRod() {
            return new SlowTempoMusicalInstrument(new GermanPercussionMusicalInstrument(new IronRod()));
        }

        // tutta questa catena di costruzioni complesse viene semplificata con il factory

}
