import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Music Alley", "MA-34-N", 35.20, 50.00, "Nylon");
    }

    @Test
    public void hasAMake() {
        assertEquals("Music Alley", guitar.getMake());
    }

    @Test

    public void hasAModel() {
        assertEquals("MA-34-N",guitar.getModel());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(35.20, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(50.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasStringType() {
        assertEquals("Nylon", guitar.getStringType());
    }

    @Test
    public void canPlay() {
        assertEquals("Cambur pinton", guitar.play());
    }
}
