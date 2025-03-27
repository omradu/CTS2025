public class Calculator {
    private double number1;
    private double number2;
    private BinaryOperator binaryOperator;

    public Calculator(double number1, double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;

        BinaryOperatorFactory binaryOperatorFactory;

        if("+".equals(operation)) {
            binaryOperatorFactory = new AdditionFactory();
        }
        else if("-".equals(operation)) {
            binaryOperatorFactory = new SubtractionFactory();
        }
        else if("*".equals(operation)) {
            binaryOperatorFactory = new MultiplicationFactory();
        }
        else if("/".equals(operation)) {
            binaryOperatorFactory = new DivisionFactory();
        }
        else {
            throw new UnsupportedOperationException();
        }

        binaryOperator = binaryOperatorFactory.getBinaryOperator();
    }

    public double calculate() {
        try {
            return binaryOperator.apply(number1, number2);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
