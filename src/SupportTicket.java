// Класс SupportTicket представляет заявку в службу поддержки.
public class SupportTicket {
    // Уникальный идентификатор заявки.
    private int ticketId;

    // Пользователь, создавший заявку.
    private UserAccount user;

    // Описание проблемы, с которой обратился пользователь.
    private String issue;

    // Статус заявки (например, "Open", "Resolved").
    private String status;

    // Конструктор класса SupportTicket.
    // При создании заявки её статус автоматически устанавливается в "Open".
    public SupportTicket(int ticketId, UserAccount user, String issue) {
        this.ticketId = ticketId;
        this.user = user;
        this.issue = issue;
        this.status = "Open"; // Начальный статус заявки.
    }

    // Метод для закрытия заявки (отметка как "Resolved").
    public void resolveTicket() {
        this.status = "Resolved"; // Устанавливаем статус заявки в "Resolved".
    }

    // Геттеры
    public int getTicketId() { return ticketId; }
    public UserAccount getUser() { return user; }
    public String getIssue() { return issue; }
    public String getStatus() { return status; }

    // Сеттеры
    public void setIssue(String issue) { this.issue = issue; }
    public void setStatus(String status) { this.status = status; }
}
