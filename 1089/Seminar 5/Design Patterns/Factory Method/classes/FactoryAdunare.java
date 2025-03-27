public class FactoryAdunare extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() {
        return new Adunare();
    }
}
