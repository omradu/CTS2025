public class WireTransfer implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via bank wire transfer");
    }
}
