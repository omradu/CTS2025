public class NotificareEmail extends SablonNotificare {
    @Override
    public void pregatesteNotificare() {
        System.out.println("Se pregateste notificarea prin email");
    }

    @Override
    public String creeazaMesaj() {
        return "Mesaj de notificare prin email";
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
