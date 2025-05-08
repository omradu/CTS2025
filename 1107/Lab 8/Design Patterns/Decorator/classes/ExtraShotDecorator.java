public class ExtraShotDecorator extends DrinkDecorator{
    public ExtraShotDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("The drink has an extra shot");
    }

    @Override
    public void consume() {
        super.consume();
        System.out.println("You might be tipsy!");
    }
}
