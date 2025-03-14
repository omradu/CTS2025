class PaymentService {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment: $" + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment: $" + amount);
        } else {
            throw new RuntimeException("Unsupported payment method");
        }
    }
}
