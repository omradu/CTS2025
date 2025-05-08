public class DrinkDecorator implements Drink{

    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void prepare() {
        drink.prepare();
    }

    @Override
    public void consume() {
        drink.consume();
    }
}
