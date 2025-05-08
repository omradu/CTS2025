public class Coffee implements Drink{
    String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Coffee " + this.name + " is brewing");
    }

    @Override
    public void consume() {
        System.out.println("You are energized now!");
    }
}
