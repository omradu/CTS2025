public class OrdinVanzare extends Ordin{
    private Broker broker;

    public OrdinVanzare(Broker broker, int nrActiuni) {
        super(nrActiuni);
        this.broker = broker;
    }

    @Override
    public void executareOrdin(int nrActiuni) {
        this.broker.executaOrdin(nrActiuni);
    }
}
