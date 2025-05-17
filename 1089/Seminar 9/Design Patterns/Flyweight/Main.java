public class Main {
    private static Caracter[] caractereText = new Caracter[100];
    private static CaracterConext[] locatiiCaractere = new CaracterConext[100];
    private static int nrCaractere = 0;

    public static void apasaTasta(String caracter, int locatie, CaracterFactory caracterFactory) {
        caractereText[nrCaractere] = caracterFactory.getCaracter(caracter);
        locatiiCaractere[nrCaractere] = new CaracterConext(locatie);
        nrCaractere++;
    }

    public static void main(String[] args) {
        CaracterFactory caracterFactory = new CaracterFactory();
        apasaTasta("a", nrCaractere, caracterFactory);
        apasaTasta("n", nrCaractere, caracterFactory);
        apasaTasta("a", nrCaractere, caracterFactory);
        apasaTasta("a", nrCaractere, caracterFactory);
        apasaTasta("r", nrCaractere, caracterFactory);
        apasaTasta("e", nrCaractere, caracterFactory);
        apasaTasta("m", nrCaractere, caracterFactory);
        apasaTasta("e", nrCaractere, caracterFactory);
        apasaTasta("r", nrCaractere, caracterFactory);
        apasaTasta("e", nrCaractere, caracterFactory);

        for (int i=0; i<nrCaractere; i++) {
            caractereText[i].printeaza(locatiiCaractere[i]);
        }

    }
}
