package Szlachetna;

import java.util.ArrayList;

public class Dysk {
    int aktualny_blok;
    int suma_przemieszczen = 0;
    Algorytm algorytm;
    ArrayList<Zadanie> zadania;

    public Dysk(Algorytm algorytm, ArrayList<Zadanie> zadania) {
        this.algorytm = algorytm;
        this.zadania = zadania;
        this.aktualny_blok = zadania.get(0).getNr_blok();

        while (!zadania.isEmpty()){
            Zadanie doWykonania = algorytm.nastepny(zadania, aktualny_blok);

//            System.out.println(doWykonania);
//            System.out.println(Math.abs(doWykonania.getNr_blok()-aktualny_blok));

            suma_przemieszczen += Math.abs(doWykonania.getNr_blok()-aktualny_blok);
            aktualny_blok = doWykonania.getNr_blok();
            zadania.remove(doWykonania);
        }

        if(algorytm instanceof SCAN) suma_przemieszczen+= ((SCAN) algorytm).getNiedomiar();
        if(algorytm instanceof CSCAN) suma_przemieszczen+= ((CSCAN) algorytm).getNiedomiar();

    }

    public int getSuma_przemieszczen() {
        return suma_przemieszczen;
    }
}
