public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(300, "Georgiana");

        shoppingCart.setPaymentMethod(new WireTransfer());
        shoppingCart.pay();
        System.out.println("Wire transfer was refused");

        shoppingCart.setPaymentMethod(new PayPalService());
        shoppingCart.pay();
        System.out.println("PayPal verification failed. Please try again");

        shoppingCart.setPaymentMethod(new Cash());
        shoppingCart.pay();
        System.out.println("Thank you for your order!");
    }
}
