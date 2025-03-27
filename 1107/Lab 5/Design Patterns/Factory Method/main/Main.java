public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5, 8, "+");
        System.out.println(calculator.calculate());

        Calculator calculator2 = new Calculator(28.3, 18, "*");
        System.out.println(calculator2.calculate());

    }
}
