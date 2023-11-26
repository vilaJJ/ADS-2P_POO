package dev.mandevilla.Questoes.Q7.Comparatores;

import java.util.Comparator;

import dev.mandevilla.Questoes.Q7.Classes.Boi;

public class BoiComparator implements Comparator<Boi> {
    @Override
    public int compare(Boi boi1, Boi boi2) {
        return Float.compare(boi1.getPeso(), boi2.getPeso()) ;
    }
}
