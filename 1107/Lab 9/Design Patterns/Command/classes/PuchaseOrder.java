public class PuchaseOrder extends Order{
    private Broker broker;

    public PuchaseOrder(Broker broker,int nbStocks) {
        super(nbStocks);
        this.broker = broker;
    }

    @Override
    void executeOrder(int nbStocks) {
        broker.executeOrder(this.nbStocks);
    }
}
