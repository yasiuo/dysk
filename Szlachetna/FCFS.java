package Szlachetna;

import java.util.ArrayList;

public class FCFS extends Algorytm {

    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {
        return zadania.get(0);
    }
}
