public class PlataCard implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Platesti " + suma + " cu cardul");
    }
}
