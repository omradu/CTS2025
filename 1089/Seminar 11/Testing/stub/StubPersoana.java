public class StubPersoana implements IPersoana {
    int returnGetCalculeazaScorCredit;

    public void setReturnGetCalculeazaScorCredit(int returnGetCalculeazaScorCredit) {
        this.returnGetCalculeazaScorCredit = returnGetCalculeazaScorCredit;
    }

    @Override
    public int calculeazaScorCredit() {
        return returnGetCalculeazaScorCredit;
    }
}
