public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Investor investor = new Investor("Marcel");
        BrokerApp brokerApp = new BrokerApp();

        stockMarket.registerObserver(investor);
        stockMarket.registerObserver(brokerApp);
        stockMarket.notifyObservers("AAPL", 100);
        stockMarket.notifyObservers("AMZN", 188);

        stockMarket.unregisterObserver(investor);
        stockMarket.notifyObservers("AAPL", 120);
    }
}
