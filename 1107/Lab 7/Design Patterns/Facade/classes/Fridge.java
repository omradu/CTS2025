public class Fridge {
    private boolean isDoorOpen = false;
    protected boolean isExtraFreezeOn = false;
    private boolean isSpeakerOn = false;
    private int itemCount = 0;

    public void openDoor()
    {
        isDoorOpen = true;
    }

    public void closeDoor()
    {
        isDoorOpen = false;
    }

    public void turnExtraFreezeOn() {

        isExtraFreezeOn = true;
    }

    public void turnExtraFreezeOff() {
        isExtraFreezeOn = false;
    }

    public void turnSpeakerOn() {

        isSpeakerOn = true;
    }

    public void turnSpeakerOff() {
        isSpeakerOn = false;
    }

    public void setItemCount(int iCount) {
        itemCount = iCount;
    }

     public int getItemCount() {
        return getItemCount();
    }

}
