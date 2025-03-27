public class SubtractionFactory extends BinaryOperatorFactory {
    @Override
    public BinaryOperator getBinaryOperator() {
        return new Subtraction();
    }
}
