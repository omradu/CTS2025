public class PlataTransferBancar implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Platesti " + suma + " prin transfer bancar");
    }
}
