public class Cash implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with cash when package arrives");
    }
}
