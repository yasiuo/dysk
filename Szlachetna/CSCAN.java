package Szlachetna;

import java.util.ArrayList;
import java.util.Comparator;

public class CSCAN extends Algorytm{
    int niedomiar = 0;

    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {
        zadania.sort(new Comparator<Zadanie>() {
            @Override
            public int compare(Zadanie o1, Zadanie o2) {
                return o1.getNr_blok() - o2.getNr_blok();
            }
        });

        for (Zadanie x : zadania) {
            if (x.getNr_blok() >= aktualny_blok) {
                return x;
            }
            niedomiar = 2*Math.abs(aktualny_blok-Main.max);
        }
        return zadania.get(0);
    }

    public int getNiedomiar() {
        return niedomiar;
    }
}
