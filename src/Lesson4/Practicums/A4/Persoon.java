package Lesson4.Practicums.A4;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
