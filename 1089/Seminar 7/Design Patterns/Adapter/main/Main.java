public class Main {
    public static void main(String[] args) {
        AdaptorObiecteAT adapter = new AdaptorObiecteAT(new SistemBileteAutobuz());
        adapter.rezervaLoc(5,26);

        AdaptorClaseAT adapter1 = new AdaptorClaseAT();
        adapter1.rezervaLoc(4, 29);
    }
}
