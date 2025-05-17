public class Main {
    public static void main(String[] args) {
        AplicatieBroker tradeVilleApp = new AplicatieBroker();
        Broker tradeville = new Broker();
        tradeVilleApp.adaugareOrdin(new OrdinCumparare(tradeville, 10));
        System.out.println("Am raspuns la un telefon");
        tradeVilleApp.adaugareOrdin(new OrdinVanzare(tradeville, 5));
        tradeVilleApp.adaugareOrdin(new OrdinCumparare(tradeville, 15));
        System.out.println("Am scris un emai;");
        tradeVilleApp.trimiteOrdineSpreExecutie();
    }
}
