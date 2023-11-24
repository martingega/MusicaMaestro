package it.unimi.di.sweng.katamusicamaestro;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ObservableMusicalInstrument extends DecoratorMusicalInstrument {

    private final List<Observer<String>> observers = new ArrayList<>();
    private final String className;

    protected ObservableMusicalInstrument(@NotNull MusicalInstrument instrument) {
        super(instrument);
        className = instrument.getClass().getSimpleName();
    }

    public void register(Observer<String> observer) {
        observers.add(observer);
    }

    private void notifyObservers(){
        for (Observer<String> observer : observers) {
            observer.update(className);  // modalità PUSH
        }
    }

    @Override
    @NotNull String specificDecoration(@NotNull String original){
        notifyObservers();
        return original;
    }

}
