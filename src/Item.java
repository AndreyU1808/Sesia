// Класс Item представляет товар на маркетплейсе (например, игра или ключ).
public class Item {
    private int itemId;      // Уникальный идентификатор товара
    private String name;     // Название товара
    private double price;    // Цена товара
    private String category; // Категория товара (например, "Game" или "Game Key")

    // Конструктор класса Item, который инициализирует товар.
    public Item(int itemId, String name, double price, String category) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Геттеры для получения информации о товаре
    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    // Сеттеры для изменения данных товара
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }
}
