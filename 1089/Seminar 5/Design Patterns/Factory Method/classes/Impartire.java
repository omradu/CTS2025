public class Impartire implements OperatorBinar{

    @Override
    public double aplicare(double numar1, double numar2) {
        if(numar2 != 0) {
            return numar1/numar2;
        } else {
            throw new UnsupportedOperationException("Nu se poate imparti la 0");
        }
    }
}
