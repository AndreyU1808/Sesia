import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Game game = new Game(9837, "Tittanfal2", 98);

        UserAccount user1 = new UserAccount(18, "dhnfijd@mail.ru", "21djsk", LocalDateTime.now(), "Mira",
                "hdjdh21", "hiudf8219", "ibmin", "VisaCard", "djh",
                28, "HEADPHONE GREEN, MOUS BLUE, KEYBOARD RAINBOW");

        Review review = new Review(28, 97, 6, "normal game for killing time on work");

        Product product = new Product(28, "Funtap", 26.6f, 972, "survavel");

        Skin skin = new Skin(79, "knifeBouvi", 28, "legendray");

        Sale trade = new Sale(79, user1, product, 27, "accept");

        Order firsSearch = new Order(921, 1412, "ddis1724", "28sept", "accept", 98.4f);

        Cart cart = new Cart("DeluxEdition", 28, 9837, "Funtap");

        Transaction transaction1 = new Transaction(64, 9837, 43, 64.5f,
                "CardVIsa", "accept");

        Decoration decoration1 = new Decoration(134, "Rainbow Bow", "hdkjd0", 934.1, 98);

        Admin admin = new Admin(
                2, "admin@mail.com", "adminpass", LocalDateTime.now(),
                "AdminUser", "Mars", "adminLink", "adminProfile",
                "AdminCard", "All Games", 9999, "Golden Skin");

        UserAccount user2 = new UserAccount(
                19, "simple@mail.com", "123456", LocalDateTime.now(),
                "SimpleUser", "Earth", "link", "profile", "MasterCard",
                "One Game", 100, "Plain Skin");

        UserAccount admin2 = new Admin(
                3, "secondadmin@mail.com", "securepass", LocalDateTime.now(),
                "SecondAdmin", "Venus", "link2", "profile2", "GoldCard",
                "All Games", 8888, "Gold Skin");

        admin.getFullName();

        admin.displayRole();
        admin.banUser(user1);

        user1.showRole();
        user2.showRole();
        admin2.showRole();
    }
}