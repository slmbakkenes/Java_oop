package Lesson5.Practicums;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        this.naam = nm;
        this.cijfer = 0.0; // standaardwaarde
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double c) {
        cijfer = c;
    }

    @Override
    public String toString() {
        return naam + " heeft cijfer: " + cijfer;
    }
}
