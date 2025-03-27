public class FactoryInmultire extends FactoryOperatorBinar{

    @Override
    public OperatorBinar getOperatorBinar() {
        return new Inmultire();
    }
}
