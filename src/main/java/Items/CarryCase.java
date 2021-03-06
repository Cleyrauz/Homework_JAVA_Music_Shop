package Items;

import java.util.ArrayList;

public class CarryCase extends Item {

    private String colour;
    private String material;

    public CarryCase(String type, double buyingPrice, double sellingPrice, String colour, String material) {
        super(type, buyingPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
