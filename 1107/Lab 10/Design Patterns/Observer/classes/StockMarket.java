public class StockMarket {
    ArrayList<StockObserver> stockObservers = new ArrayList<>();

    public void registerObserver(StockObserver observer) {
        this.stockObservers.add(observer);
    }

    public void unregisterObserver(StockObserver observer) {
        this.stockObservers.remove(observer);
    }

    public void notifyObservers(String stockSymbol, double price) {
        for(StockObserver observer : stockObservers) {
            observer.priceUpdate(stockSymbol, price);
        }
    }
}
