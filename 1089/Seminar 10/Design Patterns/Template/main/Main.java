public class Main {
    public static void main(String[] args) {
        SablonNotificare notificarePush = new NotificarePush();
        SablonNotificare notificareEmail = new NotificareEmail();
        SablonNotificare notificareSMS = new NotificareSMS();

        notificarePush.trimiteNotificare();
        notificareEmail.trimiteNotificare();
        notificareSMS.trimiteNotificare();
    }
}
