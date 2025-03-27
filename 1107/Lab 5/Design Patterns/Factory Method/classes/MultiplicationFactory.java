public class MultiplicationFactory extends BinaryOperatorFactory {

    @Override
    public BinaryOperator getBinaryOperator() {
        return new Multiplication();
    }
}
