package Szlachetna;

import java.util.ArrayList;
import java.util.Collections;

public class SSTF extends Algorytm {
    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {
        ArrayList<Integer> odleglosci = new ArrayList<>();
        for (Zadanie x : zadania)
            odleglosci.add(Math.abs(aktualny_blok-x.getNr_blok()));

        int minimum = odleglosci.get(0);
        for (Integer x : odleglosci)
            if (x<minimum)
                minimum=x;
            ;
        Zadanie zwrot = zadania.get(odleglosci.indexOf(minimum));
        return zwrot;
    }
}
