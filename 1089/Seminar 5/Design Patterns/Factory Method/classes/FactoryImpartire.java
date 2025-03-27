public class FactoryImpartire extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() {
        return new Impartire();
    }
}
