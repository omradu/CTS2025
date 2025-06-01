public class EmailNotification extends NotificationTemplate{
    @Override
    public void prepareNotification() {
        System.out.println("Preparing email notification");
    }

    @Override
    public String createMessage() {
        return "Email notification message";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + message);
    }
}
