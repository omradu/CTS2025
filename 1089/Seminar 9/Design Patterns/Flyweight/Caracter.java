public class Caracter implements CaracterPrintabil{

    private final String caracter;

    public Caracter(String caracter) {
        this.caracter = caracter;
    }

    public String getCaracter() {
        return caracter;
    }

    @Override
    public void printeaza(CaracterConext context) {
        System.out.println(this.caracter + " este pe pozitia " + context.getLocatie());
    }
}
