public class NoAlcoholDecorator extends DrinkDecorator{
    public NoAlcoholDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void consume() {
        super.consume();
        System.out.println("You can drive!");
    }
}
