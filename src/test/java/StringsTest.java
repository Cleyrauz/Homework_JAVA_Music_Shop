import Items.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringsTest {

    Strings string;

    @Before
    public void setUp() {
        string = new Strings("Nylon", 2.50, 3.25);
    }

    @Test
    public void hasType() {
        assertEquals("Nylon", string.getType());
    }

    @Test

    public void hasBuyingPrice() {
        assertEquals(2.50, string.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3.25, string.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(0.75, string.calculateMarkUp(), 0.01);
    }
}
