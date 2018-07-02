import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Andoer", "Alto", 188.90, 240.00, "Brass");
    }

    @Test
    public void hasAMake() {
        assertEquals("Andoer", saxophone.getMake());
    }

    @Test

    public void hasAModel() {
        assertEquals("Alto", saxophone.getModel());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(188.90, saxophone.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(240.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void hasDecoration() {
        assertEquals("Brass", saxophone.getDecoration());
    }

    @Test
    public void canPlay() {
        assertEquals("Praaaaap", saxophone.play());
    }
}
