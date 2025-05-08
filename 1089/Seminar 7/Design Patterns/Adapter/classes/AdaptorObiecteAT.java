public class AdaptorObiecteAT implements SistemBileteTrenAbstract {
    private SistemBileteAutobuzAbstract sistemBileteAutobuz;

    public AdaptorObiecteAT(SistemBileteAutobuzAbstract sistemBileteAutobuz) {
        this.sistemBileteAutobuz = sistemBileteAutobuz;
    }

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        sistemBileteAutobuz.cumparaBilet();
    }
}
