public class Main {
    public static void main(String[] args) {
        NotificationTemplate pushNotification = new PushNotification();
        NotificationTemplate emailNotification = new EmailNotification();
        NotificationTemplate SMSNotification = new SMSNotification();

        pushNotification.sendNotification();
        emailNotification.sendNotification();
        SMSNotification.sendNotification();
    }
}
