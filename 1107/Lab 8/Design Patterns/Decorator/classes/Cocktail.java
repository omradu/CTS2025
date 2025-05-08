public class Cocktail implements Drink{

    String name;

    public Cocktail(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("The cocktail " + this.name + " is preparing");
    }

    @Override
    public void consume() {
        System.out.println("No more " + this.name);
    }
}
