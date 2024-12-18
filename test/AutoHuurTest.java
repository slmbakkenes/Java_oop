import Lesson4.Practicums.B4.Auto;
import Lesson4.Practicums.B4.AutoHuur;
import Lesson4.Practicums.B4.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    private AutoHuur autoHuur;
    private Auto auto;
    private Klant klant;

    @BeforeEach
    public void setUp() {
        autoHuur = new AutoHuur();
        auto = new Auto("Toyota Corolla", 50.0);
        klant = new Klant("Piet");
    }

    @Test
    public void totaalPrijs_GeenHuurderGeenAuto_Zero() {
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    public void toString_GeenHuurderGeenAuto_CorrectOutput() {
        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0", autoHuur.toString().trim());
    }

    @Test
    public void totaalPrijs_GeenHuurderWelAuto_Zero() {
        autoHuur.setGehuurdeAuto(auto);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    public void toString_GeenHuurderWelAuto_CorrectOutput() {
        autoHuur.setGehuurdeAuto(auto);
        assertEquals("autotype: Toyota Corolla met prijs per dag: 50.0\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0", autoHuur.toString().trim());
    }

    @Test
    public void totaalPrijs_WelHuurderGeenAuto_Zero() {
        klant.setKorting(10.0);
        autoHuur.setHuurder(klant);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    public void toString_WelHuurderGeenAuto_CorrectOutput() {
        klant.setKorting(10.0);
        autoHuur.setHuurder(klant);
        assertEquals("er is geen auto bekend\nop naam van: Piet (korting: 10.0%)\naantal dagen: 0 en dat kost 0.0", autoHuur.toString().trim());
    }

    @Test
    public void totaalPrijs_HuurderZonderKorting_CorrectCalculation() {
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        autoHuur.setAantalDagen(3);
        assertEquals(150.0, autoHuur.totaalPrijs());
    }

    @Test
    public void totaalPrijs_HuurderMetKorting_CorrectCalculation() {
        klant.setKorting(10.0);
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        autoHuur.setAantalDagen(3);
        assertEquals(135.0, autoHuur.totaalPrijs());
    }

    @Test
    public void totaalPrijs_GeenDagenGehuurd_Zero() {
        klant.setKorting(5.0);
        autoHuur.setGehuurdeAuto(new Auto("Ford Fiesta", 40.0));
        autoHuur.setHuurder(klant);
        autoHuur.setAantalDagen(0);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    public void toString_WijzigHuurder_CorrectOutput() {
        autoHuur.setHuurder(null);
        autoHuur.setHuurder(new Klant("John"));
        assertEquals("er is geen auto bekend\nop naam van: John (korting: 0.0%)\naantal dagen: 0 en dat kost 0.0", autoHuur.toString().trim());
    }

    @Test
    public void totaalPrijs_WijzigAantalDagen_CorrectCalculation() {
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        autoHuur.setAantalDagen(5);
        assertEquals(250.0, autoHuur.totaalPrijs());
    }

    @Test
    public void totaalPrijs_AantalDagenGewijzigd_CorrectCalculation() {
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        autoHuur.setAantalDagen(2);
        assertEquals(100.0, autoHuur.totaalPrijs());
    }
}
