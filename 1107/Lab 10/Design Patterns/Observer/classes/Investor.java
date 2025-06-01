public class Investor implements StockObserver{
    String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void priceUpdate(String stockSymbol, double stockPrice) {
        System.out.println("Hi " + this.name + ", the price for " + stockSymbol + " is now: $" + stockPrice);
    }
}
