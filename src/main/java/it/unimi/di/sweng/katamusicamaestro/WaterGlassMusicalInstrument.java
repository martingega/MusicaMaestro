package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

public class WaterGlassMusicalInstrument extends WaterGlass implements MusicalInstrument {

    // Realizza un CLASS ADAPTER

    @Override
    public @NotNull String play() {
        return tap();  // oppure super.tap()
    }
}
