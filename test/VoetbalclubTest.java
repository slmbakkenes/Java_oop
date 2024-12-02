import Lesson2.Practicums.B2.Voetbalclub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    @Test
    public void testNaamConstructor() {
        Voetbalclub club1 = new Voetbalclub("Ajax");
        assertEquals("Ajax", club1.getNaam());

        Voetbalclub club2 = new Voetbalclub("");
        assertEquals("FC", club2.getNaam());

        Voetbalclub club3 = new Voetbalclub("   ");
        assertEquals("FC", club3.getNaam());
    }

    @Test
    public void testResultatenVerwerken() {
        Voetbalclub club = new Voetbalclub("PSV");

        club.verwerkResultaat('w');
        assertEquals(1, club.getAantalGewonnen());
        assertEquals(3, club.aantalPunten());

        club.verwerkResultaat('g');
        assertEquals(1, club.getAantalGelijk());
        assertEquals(4, club.aantalPunten());

        club.verwerkResultaat('v');
        assertEquals(1, club.getAantalVerloren());
        assertEquals(4, club.aantalPunten());
    }

    @Test
    public void testFouteInvoer() {
        Voetbalclub club = new Voetbalclub("Feyenoord");

        club.verwerkResultaat('x');
        assertEquals(0, club.getAantalGewonnen());
        assertEquals(0, club.getAantalGelijk());
        assertEquals(0, club.getAantalVerloren());
        assertEquals(0, club.aantalPunten());
        assertEquals(0, club.aantalGespeeld());
    }

    @Test
    public void testAantalGespeeld() {
        Voetbalclub club = new Voetbalclub("FC Utrecht");

        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');
        club.verwerkResultaat('v');

        assertEquals(4, club.aantalGespeeld());
        assertEquals(3, club.aantalPunten());
    }

    @Test
    public void testToString() {
        Voetbalclub club = new Voetbalclub("AZ");

        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');

        String expected = "AZ 3 1 1 1 4";
        assertEquals(expected, club.toString());
    }
}
