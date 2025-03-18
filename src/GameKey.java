// Класс GameKey также наследует Item, но представляет отдельный ключ от игры
public class GameKey extends Item {
    private String key; // Уникальный ключ игры

    // Конструктор
    public GameKey(int itemId, String name, double price, String key) {
        super(itemId, name, price, "Game Key");
        this.key = key;
    }

    // Геттер и сеттер для ключа
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
}

