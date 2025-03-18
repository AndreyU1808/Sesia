import java.util.ArrayList;
import java.util.List;

// Класс Marketplace представляет магазин, в котором можно покупать и продавать товары.
public class Marketplace {
    private List<Listing> listings; // Список объявлений о продаже

    // Конструктор
    public Marketplace() {
        this.listings = new ArrayList<>();
    }

    // Метод для размещения объявления о продаже товара
    public void listItemForSale(Item item, double price, UserAccount seller) {
        listings.add(new Listing(item, price, seller));
    }

    // Метод для покупки товара
    public boolean buyItem(UserAccount buyer, Listing listing) {
        if (buyer.purchaseItem(listing.getItem(), listing.getPrice())) {
            listings.remove(listing); // Убираем товар из списка после покупки
            return true;
        }
        return false;
    }

    // Геттер списка объявлений
    public List<Listing> getListings() { return listings; }

    // Метод для удаления объявления
    public void removeListing(Listing listing) { listings.remove(listing); }
}

