import Items.CarryCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarryCaseTest {

    CarryCase carryCase;

    @Before
    public void setUp() {
        carryCase = new CarryCase("Guitar", 24.99, 35.00, "black", "leather");
    }

    @Test
    public void hasAType() {
        assertEquals("Guitar", carryCase.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(24.99, carryCase.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(35.00, carryCase.getSellingPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("black", carryCase.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("leather", carryCase.getMaterial());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(10.01, carryCase.calculateMarkUp(), 0.01);
    }
}
