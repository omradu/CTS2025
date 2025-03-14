public class Eagle implements FeatheredCreature, FlyingCreature{
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialNumberOfFeathers) {

        this.numberOfFeathers = initialNumberOfFeathers;
    }

    public void fly() {

        this.currentLocation = "in the air";
    }

    public void molt() {

        this.numberOfFeathers -= 1;
    }
}

