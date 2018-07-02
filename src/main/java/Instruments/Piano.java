package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    public Piano(String make, String model, double buyingPrice, double sellingPrice) {
        super(make, model, buyingPrice, sellingPrice);
    }

    public String play() {
        return "Plink, plonk";
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
