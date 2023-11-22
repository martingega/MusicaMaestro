package it.unimi.di.sweng.katamusicamaestro;

public class WaterGlassMusicalInstrument extends WaterGlass implements MusicalInstrument {

    // Realizza un CLASS ADAPTER

    @Override
    public String play() {
        return tap();  // oppure super.tap()
    }
}
