public abstract class Ordin {

    protected int nrActiuni;

    public Ordin(int nrActiuni) {
        this.nrActiuni = nrActiuni;
    }

    abstract void executareOrdin(int nrActiuni);
}
