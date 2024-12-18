package Lesson4.Practicums.B4;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return this.kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
