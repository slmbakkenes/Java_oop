package Lesson4.Practicums.B4;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
        this.aantalDagen = 0;
        this.gehuurdeAuto = null;
        this.huurder = null;
    }

    public void setAantalDagen(int aD){
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return this.aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return this.gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return this.huurder;
    }

    public Double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        double prijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        return prijs - (prijs * huurder.getKorting() / 100);
    }

    @Override
    public String toString() {
        String autoInfo = (gehuurdeAuto == null) ? "er is geen auto bekend" : "autotype: " + gehuurdeAuto;
        String klantInfo = (huurder == null) ? "er is geen huurder bekend" : "op naam van: " + huurder;
        return autoInfo + "\n" + klantInfo + "\n" + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
