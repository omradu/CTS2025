public class ShoppingCart {
    double amount;
    String accountUsername;

    IPayment paymentMethod = null;

    public ShoppingCart(double amount, String accountUsername) {
        this.amount = amount;
        this.accountUsername = accountUsername;
    }

    public void pay() {
        if(paymentMethod!=null) {
            this.paymentMethod.pay(this.amount);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
