package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String stringType;


    public Guitar(String make, String model, double buyingPrice, double sellingPrice, String stringType) {
        super(make, model, buyingPrice, sellingPrice);
        this.stringType = stringType;
    }

    public String getStringType() {
        return stringType;
    }

    public String play() {
        return "Cambur pinton";
    }
    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
