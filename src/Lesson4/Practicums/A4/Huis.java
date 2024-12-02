package Lesson4.Practicums.A4;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas; // Huis heeft een relatie naar Persoon

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        String result = "Huis " + adres + " is gebouwd in " + bouwjaar;
        if (huisbaas != null) {
            result += "\nen heeft huisbaas " + huisbaas;
        }
        return result;
    }
}
