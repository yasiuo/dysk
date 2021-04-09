package Szlachetna;

import java.util.ArrayList;
import java.util.Comparator;

public class SCAN extends Algorytm{
    boolean prawo = true;
    int niedomiar = 0;
    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {
        zadania.sort(new Comparator<Zadanie>() {
            @Override
            public int compare(Zadanie o1, Zadanie o2) {
                return o1.getNr_blok() - o2.getNr_blok();
            }
        });

        if (prawo) {
            for (Zadanie x : zadania) {
                if (x.getNr_blok() >= aktualny_blok) {
                    return x;
                }
            }
            prawo = false;
            niedomiar = 2*Math.abs(aktualny_blok-Main.max);
        }
        return zadania.get(zadania.size()-1);
    }

    public int getNiedomiar() {
        return niedomiar;
    }

    public void setPrawo(boolean prawo) {
        this.prawo = prawo;
    }
}
