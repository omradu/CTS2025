public class ExtraHotDecorator extends DrinkDecorator{
    public ExtraHotDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void consume() {
        System.out.println("Pay attention, the drink is extra hot!");
        super.consume();
    }
}
