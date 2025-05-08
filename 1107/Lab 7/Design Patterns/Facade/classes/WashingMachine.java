public class WashingMachine {
    protected boolean isOn = false;
    private int nbHoursToRun = 0;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
    
    public void setNbHoursToRun(int nbHours) {
        nbHoursToRun = nbHours;
    }
}
