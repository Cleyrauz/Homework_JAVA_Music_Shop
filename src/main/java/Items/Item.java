package Items;

import Behaviours.ISell;

public abstract class Item implements ISell {

    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String type, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
