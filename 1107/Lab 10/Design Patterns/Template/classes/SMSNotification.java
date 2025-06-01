public class SMSNotification extends NotificationTemplate{
    @Override
    public void prepareNotification() {
        System.out.println("Preparing SMS notification");
    }

    @Override
    public String createMessage() {
        return "SMS notification message";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + message);
    }
}
