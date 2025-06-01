public class PushNotification extends NotificationTemplate{
    @Override
    public void prepareNotification() {
        System.out.println("Preparing push notification");
    }

    @Override
    public String createMessage() {
        return "Push notification message";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + message);
    }
}
