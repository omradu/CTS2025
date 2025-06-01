public class NotificarePush extends SablonNotificare {
    @Override
    public void pregatesteNotificare() {
        System.out.println("Se pregateste notificarea push");
    }

    @Override
    public String creeazaMesaj() {
        return "Mesaj de notificare push";
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
