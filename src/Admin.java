// Класс Admin представляет администратора системы.
public class Admin {
    // Поле для хранения уникального идентификатора администратора.
    private int adminId;

    // Поле для хранения имени пользователя администратора.
    private String username;

    // Конструктор класса Admin для инициализации объекта с заданными параметрами.
    public Admin(int adminId, String username) {
        this.adminId = adminId;
        this.username = username;
    }

    // Метод для установки цены на товар (Item).
    // Принимает объект Item и новое значение цены, затем устанавливает его.
    public void setItemPrice(Item item, double price) {
        item.setPrice(price);
    }
}
