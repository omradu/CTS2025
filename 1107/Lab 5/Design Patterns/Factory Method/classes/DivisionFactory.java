public class DivisionFactory extends BinaryOperatorFactory {
    @Override
    public BinaryOperator getBinaryOperator() {
        return new Division();
    }
}
