public class FactoryScadere extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() {
        return new Scadere();
    }
}
