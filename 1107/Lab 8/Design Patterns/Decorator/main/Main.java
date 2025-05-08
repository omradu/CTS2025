public class Main {
    public static void main(String[] args) {
        Cocktail cocktail = new Cocktail("Mojito");

        cocktail.prepare();
        cocktail.consume();
        System.out.println("------------------");

        DrinkDecorator cocktailWithoutAlcohol = new NoAlcoholDecorator(cocktail);
        cocktailWithoutAlcohol.prepare();
        cocktailWithoutAlcohol.consume();
        System.out.println("------------------");

        Coffee coffee = new Coffee("Cappuccino");
        DrinkDecorator extraHotCoffee = new ExtraHotDecorator(coffee);
        coffee.prepare();
        coffee.consume();
        System.out.println("------------------");

        DrinkDecorator cocktailWithoutIceAndNoAlcohol = new NoIceDecorator(cocktailWithoutAlcohol);
        cocktailWithoutIceAndNoAlcohol.prepare();
        cocktailWithoutIceAndNoAlcohol.consume();

    }
}
