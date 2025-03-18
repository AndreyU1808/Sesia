// Класс Game наследует Item и добавляет поле "ключ игры"
public class Game extends Item {
    private String key; // Уникальный ключ активации игры

    // Конструктор класса Game
    public Game(int itemId, String name, double price, String key) {
        // Вызываем конструктор родительского класса Item
        super(itemId, name, price, "Game");
        this.key = key;
    }

    // Геттер и сеттер для ключа игры
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
}
