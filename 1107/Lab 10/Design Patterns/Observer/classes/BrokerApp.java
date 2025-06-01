public class BrokerApp implements StockObserver{
    @Override
    public void priceUpdate(String stockSymbol, double stockPrice) {
        System.out.println("The price for " + stockSymbol + " is now: $" + stockPrice);
    }
}
