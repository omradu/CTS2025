public class Marcela {
    Fridge fridge;
    Lights bedroomLights;
    Lights livingroomLights;
    Lights kitchenLights;
    WashingMachine washingMachine;

    public Marcela(Fridge fridge, Lights bedroomLights, Lights livingroomLights, Lights kitchenLights, WashingMachine washingMachine) {
        this.fridge = fridge;
        this.bedroomLights = bedroomLights;
        this.livingroomLights = livingroomLights;
        this.kitchenLights = kitchenLights;
        this.washingMachine = washingMachine;
    }

    public void cookingMode(){
        this.fridge.turnExtraFreezeOn();
        this.fridge.turnSpeakerOn();
        this.kitchenLights.turnOn();
        this.kitchenLights.setColor("Pink");;

        System.out.println("Spor la gatit!");
    }

    public void goodbye() {
        this.fridge.closeDoor();
        this.kitchenLights.turnOff();
        this.livingroomLights.turnOff();
        this.bedroomLights.turnOff();
        this.washingMachine.setNbHoursToRun(2);
        this.washingMachine.turnOn();
        if(this.fridge.getItemCount()<5) {
            System.out.println("Alert! Trebuie sa faci cumparaturi!");
        }
        
        System.out.println("See you later, Aligator!");
    }
    
    public void welcomeBack() {
        this.bedroomLights.turnOn();
        this.fridge.openDoor();
        this.fridge.setItemCount(10);
        System.out.println("Hi again");
    }

}
