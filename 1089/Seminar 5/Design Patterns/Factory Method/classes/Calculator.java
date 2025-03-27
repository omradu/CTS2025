public class Calculator {
    private double numar1;
    private double numar2;
    private OperatorBinar operatorBinar;

    public Calculator(double numar1, double numar2, String operatie) {
        this.numar1 = numar1;
        this.numar2 = numar2;

        FactoryOperatorBinar factoryOperatorBinar;

        if("+".equals(operatie)) {
            factoryOperatorBinar = new FactoryAdunare();
        }
        else if("-".equals(operatie)) {
            factoryOperatorBinar = new FactoryScadere();
        }
        else if("*".equals(operatie)) {
            factoryOperatorBinar = new FactoryInmultire();
        }
        else if("/".equals(operatie)) {
            factoryOperatorBinar = new FactoryImpartire();
        }
        else {
            throw new UnsupportedOperationException();
        }

        operatorBinar = factoryOperatorBinar.getOperatorBinar();
    }

    public double calculeaza() {
        try {
            return operatorBinar.aplicare(numar1,numar2);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
