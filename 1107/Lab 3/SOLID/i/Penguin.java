public class Penguin implements SwimmingCreature, FeatheredCreature{
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {

        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }

    @Override
    public void swim() {

        this.currentLocation = "in the water";
    }
}
