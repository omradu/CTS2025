public class NotificareSMS extends SablonNotificare {
    @Override
    public void pregatesteNotificare() {
        System.out.println("Se pregateste notificarea SMS");
    }

    @Override
    public String creeazaMesaj() {
        return "Mesaj de notificare SMS";
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
