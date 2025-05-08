public class AdaptorClaseAT extends SistemBileteAutobuz implements SistemBileteTrenAbstract {
    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        super.cumparaBilet();
    }
}
