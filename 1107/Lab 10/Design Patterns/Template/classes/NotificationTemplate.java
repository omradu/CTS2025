public abstract class NotificationTemplate {
    //define the steps
    public abstract void prepareNotification();
    public abstract String createMessage();
    public abstract void sendMessage(String message);

    //template method
    public final void sendNotification() {
        prepareNotification();
        String message = createMessage();
        sendMessage(message);
    }
}
