public class SellOrder extends Order{
    private Broker broker;

    public SellOrder(Broker broker, int nbStocks) {
        super(nbStocks);
        this.broker=broker;
    }

    @Override
    void executeOrder(int nbStocks) {
        this.broker.executeOrder(nbStocks);
    }
}
