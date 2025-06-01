public class Main {
    public static void main(String[] args) {
        PiataDeActiuni piata = new PiataDeActiuni();

        Investitor investitor = new Investitor("Marcel");
        AplicatieBroker aplicatieBroker = new AplicatieBroker();

        piata.inregistreazaObservator(investitor);
        piata.inregistreazaObservator(aplicatieBroker);

        piata.notificaObservatori("AAPL", 100);
        piata.notificaObservatori("AMZN", 188);

        piata.stergeObservator(investitor);
        piata.notificaObservatori("AAPL", 120);
    }
}
