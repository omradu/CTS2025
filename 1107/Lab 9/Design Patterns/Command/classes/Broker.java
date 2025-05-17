public class Broker {
    public void executeOrder(int nbStocks) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order executed");
    }
}
