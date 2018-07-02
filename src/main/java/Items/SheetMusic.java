package Items;

public class SheetMusic extends Item {

    private String author;
    private String title;
    private String publishingYear;

    public SheetMusic(String type, double buyingPrice, double sellingPrice, String author, String title, String publishingYear) {
        super(type, buyingPrice, sellingPrice);
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
