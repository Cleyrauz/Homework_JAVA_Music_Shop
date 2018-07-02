package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private String decoration;

    public Saxophone(String make, String model, double buyingPrice, double sellingPrice, String decoration) {
        super(make, model, buyingPrice, sellingPrice);
        this.decoration = decoration;
    }

    public String getDecoration() {
        return decoration;
    }

    public String play() {
        return "Praaaaap";
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
