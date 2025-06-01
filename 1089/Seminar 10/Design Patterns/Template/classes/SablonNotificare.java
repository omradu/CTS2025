public abstract class SablonNotificare {
    // defineste pasii
    public abstract void pregatesteNotificare();
    public abstract String creeazaMesaj();
    public abstract void trimiteMesaj(String mesaj);

    // metoda sablon
    public final void trimiteNotificare() {
        pregatesteNotificare();
        String mesaj = creeazaMesaj();
        trimiteMesaj(mesaj);
    }
}
