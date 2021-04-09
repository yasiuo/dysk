package Szlachetna;

public class Zadanie {
    int nr_blok,deadline;

    @Override
    public String toString() {
        return "Zadanie{" +
                "nr_blok=" + nr_blok +
                ", deadline=" + deadline +
                '}';
    }

    public Zadanie(int nr_blok, int deadline) {
        this.nr_blok = nr_blok;
        this.deadline = deadline;
    }

    public int getNr_blok() {
        return nr_blok;
    }

    public void setNr_blok(int nr_blok) {
        this.nr_blok = nr_blok;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}
