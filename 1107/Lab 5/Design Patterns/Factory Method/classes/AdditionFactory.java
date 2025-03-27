public class AdditionFactory extends BinaryOperatorFactory {
    @Override
    public BinaryOperator getBinaryOperator() {
        return new Addition();
    }
}
