public class NoIceDecorator extends DrinkDecorator{
    public NoIceDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("This won't have ice");
    }

    @Override
    public void consume() {
        System.out.println("WARNING: Warm drink!");
        super.consume();
    }
}
