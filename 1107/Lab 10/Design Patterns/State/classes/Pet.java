public class Pet {
    public static final int STAMINA_LEVEL = 100;

    String name;
    int stamina = 100;

    IMovingState movingState = new HappyMovingState();

    public Pet(String name) {
        this.name = name;
    }

    public void move() {
        this.movingState.move();
    }

    public void play(int points) {
        this.stamina -= points;
        if(this.stamina< STAMINA_LEVEL) {
            this.movingState = new TiredMovingState();
        }
    }

    public void sleep(int points) {
        this.stamina += points;
        if(this.stamina>= STAMINA_LEVEL) {
            this.movingState = new HappyMovingState();
        }
    }

}
