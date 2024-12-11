import Lesson2.Practicums.B2.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {

    private Voetbalclub club;

    @BeforeEach
    void setUp() {
        club = new Voetbalclub("Ajax");
    }

    @Test
    void constructorNaamIsNullMoetFCZijn() {
        Voetbalclub club = new Voetbalclub(null);
        assertEquals("FC", club.getNaam());
    }

    @Test
    void constructorNaamIsLeegMoetFCZijn() {
        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", club.getNaam());
    }

    @Test
    void verwerkResultaatGewonnenMoetAantalGewonnen1Zijn() {
        club.verwerkResultaat('w');
        assertEquals(1, club.getAantalGewonnen());
    }

    @Test
    void verwerkResultaatGewonnenMoetPunten3Zijn() {
        club.verwerkResultaat('w');
        assertEquals(3, club.aantalPunten());
    }

    @Test
    void verwerkResultaatGelijkMoetAantalGelijk1Zijn() {
        club.verwerkResultaat('g');
        assertEquals(1, club.getAantalGelijk());
    }

    @Test
    void verwerkResultaatGelijkMoetPunten1Zijn() {
        club.verwerkResultaat('g');
        assertEquals(1, club.aantalPunten());
    }

    @Test
    void verwerkResultaatVerlorenMoetAantalVerloren1Zijn() {
        club.verwerkResultaat('v');
        assertEquals(1, club.getAantalVerloren());
    }

    @Test
    void verwerkResultaatVerlorenMoetPunten0Zijn() {
        club.verwerkResultaat('v');
        assertEquals(0, club.aantalPunten());
    }

    @Test
    void verwerkResultaatOngeldigMoetAantalGespeeld0Zijn() {
        club.verwerkResultaat('x');
        assertEquals(0, club.aantalGespeeld());
    }

    @Test
    void verwerkResultaatOngeldigMoetPunten0Zijn() {
        club.verwerkResultaat('x');
        assertEquals(0, club.aantalPunten());
    }

    @Test
    void toStringTestMoetCorrectZijnNaWedstrijden() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');
        assertEquals("Ajax 3 1 1 1 4", club.toString());
    }

    @Test
    void toStringZonderWedstrijdenMoetCorrectZijn() {
        assertEquals("Ajax 0 0 0 0 0", club.toString());
    }

    @Test
    void herhaaldelijkeVerwerkingMoetCorrectOptellenAantalGelijk() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        assertEquals(2, club.getAantalGelijk());
    }

    @Test
    void herhaaldelijkeVerwerkingMoetCorrectOptellenAantalGewonnen() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        assertEquals(2, club.getAantalGewonnen());
    }

    @Test
    void herhaaldelijkeVerwerkingMoetCorrectOptellenAantalVerloren() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        assertEquals(1, club.getAantalVerloren());
    }

    @Test
    void herhaaldelijkeVerwerkingMoetCorrectOptellenPunten() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        assertEquals(8, club.aantalPunten());
    }

    @Test
    void herhaaldelijkeVerwerkingMoetCorrectOptellenAantalGespeeld() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        assertEquals(5, club.aantalGespeeld());
    }

    @Test
    void extreemVeelResultatenMoetCorrectePuntenBerekenen() {
        for (int i = 0; i < 10000; i++) {
            club.verwerkResultaat('w');
        }
        assertEquals(30000, club.aantalPunten());
    }

    @Test
    void extreemVeelResultatenMoetCorrectAantalGespeeldBerekenen() {
        for (int i = 0; i < 10000; i++) {
            club.verwerkResultaat('w');
        }
        assertEquals(10000, club.aantalGespeeld());
    }
}
