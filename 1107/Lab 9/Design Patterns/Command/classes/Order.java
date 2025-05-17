public abstract class Order {
    protected int nbStocks;

    public Order(int nbStocks) {
        this.nbStocks = nbStocks;
    }

    abstract void executeOrder(int nbStocks);
}
