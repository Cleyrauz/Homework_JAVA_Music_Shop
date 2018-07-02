package Items;

public class Strings extends Item {
    public Strings(String type, double buyingPrice, double sellingPrice) {
        super(type, buyingPrice, sellingPrice);
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
