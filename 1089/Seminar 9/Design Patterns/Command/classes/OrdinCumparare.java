public class OrdinCumparare extends Ordin{
    private Broker broker;

    public OrdinCumparare(Broker broker, int nrActiuni) {
        super(nrActiuni);
        this.broker = broker;
    }

    @Override
    public void executareOrdin(int nrActiuni) {
        broker.executaOrdin(this.nrActiuni);
    }
}
