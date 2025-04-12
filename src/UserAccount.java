import java.time.LocalDateTime;


public class UserAccount {
    private int id;
    private String email;
    private String password;
    private LocalDateTime lastActive;
    private String fullName;
    private String address;
    private String tradeLink;
    private String profileLink;
    private String paymentCard;
    private String  displayedGames;
    private int totalPlaytime;
    private String  decoration;

    private void register(String username, String email, String password) {
    }

    private void login(String email, String password) {
    }

    private void logout() {
    }

    private void purchaseItem(int productId) {
    }

    private void addFunds(float amount) {
    }

    private void withdrawFunds(float amount) {
    }

    private void uploadCustomDecoration(String file, float price) {
    }

    private void listItemForSale(int productId, float price) {
    }

    public void showRole() {
        System.out.println("I am a regular user.");
    }


    public UserAccount(int id, String email, String password, LocalDateTime lastActive, String fullName, String address,
                       String tradeLink, String profileLink, String paymentCard, String displayedGames,
                       int totalPlaytime, String decoration) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.lastActive = lastActive;
        this.fullName = fullName;
        this.address = address;
        this.tradeLink = tradeLink;
        this.profileLink = profileLink;
        this.paymentCard = paymentCard;
        this.displayedGames = displayedGames;
        this.totalPlaytime = totalPlaytime;
        this.decoration = decoration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLastActive() {
        return lastActive;
    }

    public void setLastActive(LocalDateTime lastActive) {
        this.lastActive = lastActive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTradeLink() {
        return tradeLink;
    }

    public void setTradeLink(String tradeLink) {
        this.tradeLink = tradeLink;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }

    public String getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(String paymentCard) {
        this.paymentCard = paymentCard;
    }

    public String getDisplayedGames() {
        return displayedGames;
    }

    public void setDisplayedGames(String displayedGames) {
        this.displayedGames = displayedGames;
    }

    public int getTotalPlaytime() {
        return totalPlaytime;
    }

    public void setTotalPlaytime(int totalPlaytime) {
        this.totalPlaytime = totalPlaytime;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }
}