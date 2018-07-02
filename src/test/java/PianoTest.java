import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Casio", "CS-44PC5", 47.99, 60.00);
    }

    @Test
    public void hasAMake() {
        assertEquals("Casio", piano.getMake());
    }

    @Test

    public void hasAModel() {
        assertEquals("CS-44PC5", piano.getModel());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(47.99, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(60.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink, plonk", piano.play());
    }
}
