// Класс Listing представляет объявление о продаже товара
public class Listing {
    private Item item;          // Товар
    private double price;       // Цена товара
    private UserAccount seller; // Продавец

    // Конструктор
    public Listing(Item item, double price, UserAccount seller) {
        this.item = item;
        this.price = price;
        this.seller = seller;
    }

    // Геттеры и сеттеры
    public Item getItem() { return item; }
    public double getPrice() { return price; }
    public UserAccount getSeller() { return seller; }

    public void setItem(Item item) { this.item = item; }
    public void setPrice(double price) { this.price = price; }
    public void setSeller(UserAccount seller) { this.seller = seller; }
}
