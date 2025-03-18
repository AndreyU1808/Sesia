import java.util.ArrayList;
import java.util.List;

// Класс UserAccount представляет аккаунт пользователя на платформе.
public class UserAccount {
    private int userId;        // Уникальный ID пользователя
    private String username;   // Имя пользователя
    private String email;      // Электронная почта
    private String password;   // Пароль (в реальных приложениях нужно хешировать!)
    private double balance;    // Баланс пользователя
    private List<Item> inventory; // Инвентарь пользователя (купленные товары)

    // Конструктор класса
    public UserAccount(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.balance = 0.0;
        this.inventory = new ArrayList<>();
    }

    // Геттеры для получения информации
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public double getBalance() { return balance; }
    public List<Item> getInventory() { return inventory; }

    // Сеттеры для изменения данных пользователя
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setBalance(double balance) { this.balance = balance; }

    // Метод пополнения баланса
    public void addFunds(double amount) { this.balance += amount; }

    // Метод покупки товара
    public boolean purchaseItem(Item item, double price) {
        if (this.balance >= price) {
            this.balance -= price;
            this.inventory.add(item); // Добавляем товар в инвентарь
            return true;
        }
        return false;
    }
}
