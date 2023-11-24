package it.unimi.di.sweng.katamusicamaestro;

import java.util.Map;
import java.util.TreeMap;

public class MusicCritic implements Observer<String>{

    Map<String, Integer> memory = new TreeMap<>(); //ordine alfabetico (per le stringe) quando usiamo TreeMap

    @Override
    public void update(String instrument) {
        memory.put(instrument, memory.getOrDefault(instrument,0) + 1);
    }

    public String tellMe() {
        StringBuilder sb = new StringBuilder();
        for (String s : memory.keySet()) {
            sb.append(s).append(':').append(memory.get(s)).append('\n');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
