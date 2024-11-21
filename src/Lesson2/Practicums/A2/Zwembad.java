package Lesson2.Practicums.A2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {
        this.breedte = 0.0;
        this.lengte = 0.0;
        this.diepte = 0.0;
    }

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    // Getters
    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    // Setters
    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    // Methode om de inhoud te berekenen
    public double inhoud() {
        return breedte * lengte * diepte;
    }

    // Methode om een beschrijving te geven
    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte +
                " meter lang, en " + diepte + " meter diep.";
    }
}
