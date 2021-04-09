package Szlachetna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EDF extends Algorytm{
    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {
        Collections.sort(zadania, new Comparator<Zadanie>() {
            @Override
            public int compare(Zadanie o1, Zadanie o2) {
                return o2.getDeadline()-o1.getDeadline();
            }
        });

        return zadania.get(0);
    }
}
