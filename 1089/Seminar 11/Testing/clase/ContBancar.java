public class ContBancar {
    IPersoana detinatorCont;
    double sold;

    public ContBancar(IPersoana detinatorCont, double sold) {
        this.detinatorCont = detinatorCont;
        this.sold = sold;
    }

    public IPersoana getDetinatorCont() {
        return detinatorCont;
    }

    public void setDetinatorCont(Persoana detinatorCont) {
        this.detinatorCont = detinatorCont;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double calculeazaAvantajClient() throws ExceptieTipContInvalid {
        int avantajClient = (detinatorCont.calculeazaScorCredit()*10)/100;
        return avantajClient;
    }

}
