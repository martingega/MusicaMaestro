package it.unimi.di.sweng.katamusicamaestro;

public class WaterGlassMusicalInstrument extends WaterGlass implements MusicalInstrument {

    @Override
    public String play() {
        return tap();
    }
}
