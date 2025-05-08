public class Lights {
    protected boolean areON = false;
    private String color = "white";

    public void turnOn() {
        areON = true;
    }

    public void turnOff() {
        areON = false;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
