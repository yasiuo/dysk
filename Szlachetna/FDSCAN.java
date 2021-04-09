package Szlachetna;

import java.util.ArrayList;
import java.util.Comparator;

public class FDSCAN extends Algorytm {
    @Override
    public Zadanie nastepny(ArrayList<Zadanie> zadania, int aktualny_blok) {

        ArrayList<Zadanie> kolejPriorytet = new ArrayList<>(zadania);
        kolejPriorytet.sort(new Comparator<Zadanie>() {
            @Override
            public int compare(Zadanie o1, Zadanie o2) {
                return o2.getDeadline()- o1.getDeadline();
            }
        });

        SCAN skan = new SCAN();

        if (kolejPriorytet.get(0).getNr_blok()>aktualny_blok){
            skan.setPrawo(true);
            return skan.nastepny(zadania, aktualny_blok);
        }
        skan.setPrawo(false);
        return skan.nastepny(zadania, aktualny_blok);
    }
}
