package Lesson2.Practicums.B2;

public class Voetbalclub {
    private final String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Constructor
    public Voetbalclub(String naam) {
        if (naam == null || naam.trim().isEmpty()) {
            this.naam = "FC";
        } else {
            this.naam = naam.trim();
        }
        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    // Getters
    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen++;
        } else if (ch == 'g') {
            aantalGelijk++;
        } else if (ch == 'v') {
            aantalVerloren++;
        }
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return (3 * aantalGewonnen) + aantalGelijk;
    }

    @Override
    public String toString() {
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " +
                aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
