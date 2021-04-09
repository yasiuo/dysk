package Szlachetna;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int max = 50;
    static int liczebnosc = 5;

    public static void main(String[] args) {

        ArrayList<Zadanie> zadania = genZadan();
        for (Zadanie x : zadania) System.out.println(x);

        Dysk doFCFS = new Dysk(new FCFS(),kopiarka(zadania));
        System.out.println("FCFS: " + doFCFS.getSuma_przemieszczen());

        Dysk doSSTF = new Dysk(new SSTF(),kopiarka(zadania));
        System.out.println("SSTF: " + doSSTF.getSuma_przemieszczen());

        Dysk doSCAN = new Dysk(new SCAN(),kopiarka(zadania));
        System.out.println("SCAN: " + doSCAN.getSuma_przemieszczen());

        Dysk doCSCAN = new Dysk(new CSCAN(),kopiarka(zadania));
        System.out.println("CSCAN: " + doCSCAN.getSuma_przemieszczen());

        Dysk doEDF = new Dysk(new EDF(),kopiarka(zadania));
        System.out.println("EDF: " + doEDF.getSuma_przemieszczen());

        Dysk doFDSCAN = new Dysk(new FDSCAN(),kopiarka(zadania));
        System.out.println("FDSCAN: " + doFDSCAN.getSuma_przemieszczen());

    }

    public static ArrayList<Integer> randGenToMax(){

        ArrayList<Integer> numery = new ArrayList<Integer>();
        for (int i=1;i<max;i++){
            numery.add(i);
        }

        Collections.shuffle(numery);

        ArrayList<Integer> zwrot = new ArrayList<>();
        for (int j=0;j<liczebnosc;j++){
            zwrot.add(numery.get(j));
        }

        return zwrot;
    }

    public static ArrayList<Zadanie> kopiarka(ArrayList<Zadanie> wejscie){
        ArrayList<Zadanie> wyjscie = new ArrayList<>();
        for (Zadanie x : wejscie){
            wyjscie.add(new Zadanie(x.getNr_blok(),x.getDeadline()));
        }
        return wyjscie;
    }

    public static ArrayList<Zadanie> genZadan(){
        ArrayList<Integer> numery = randGenToMax();
        ArrayList<Zadanie> zwrot = new ArrayList<>();
        for (int i=0; i<liczebnosc;i++){
            zwrot.add(new Zadanie(numery.get(i), numery.get(numery.size()-(i+1))));
        }
        return zwrot;
    }
}
