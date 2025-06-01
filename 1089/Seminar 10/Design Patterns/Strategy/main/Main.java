public class Main {
    public static void main(String[] args) {
        CosCumparaturi cosCumparaturi = new CosCumparaturi(300, "Mihaela");

        cosCumparaturi.setMetodaPlata(new PlataTransferBancar());
        cosCumparaturi.efectueazaPlata();
        System.out.println("Banca nu e partenera, transfer refuzat!");

        cosCumparaturi.setMetodaPlata(new PlataCard());
        cosCumparaturi.efectueazaPlata();
        System.out.println("Plata a esuat. Va rugam mai incercati!");

        cosCumparaturi.setMetodaPlata(new PlataCash());
        cosCumparaturi.efectueazaPlata();
        System.out.println("Multumim pentru cumparaturi!");
    }
}
