package Lesson4.Practicums.A4;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
