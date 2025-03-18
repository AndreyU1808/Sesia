public class Main {
    public static void main(String[] args) {
        // Создаем пользователей
        UserAccount user1 = new UserAccount(1, "PlayerOne", "player1@example.com", "password123");
        UserAccount user2 = new UserAccount(2, "PlayerTwo", "player2@example.com", "password456");

        // Создаем товар (игру)
        Item game = new Game(1, "Cyberpunk 2077", 59.99, "CDKEY12345");

        // Создаем маркетплейс
        Marketplace marketplace = new Marketplace();

        // Пополняем баланс пользователя
        user1.addFunds(100);

        // Выставляем товар на продажу
        marketplace.listItemForSale(game, 59.99, user1);

        // Покупка товара
        if (!marketplace.getListings().isEmpty()) {
            Listing listing = marketplace.getListings().get(0);
            marketplace.buyItem(user2, listing);
        }
    }
}
