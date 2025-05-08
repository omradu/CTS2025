public class Cocktail implements Bautura{

    String nume;

    public Cocktail(String nume) {
        this.nume = nume;
    }

    @Override
    public void sePrepara() {
        System.out.println("Se prepara un cocktail " + this.nume);
    }

    @Override
    public void seConsuma() {
        System.out.println("Se consuma un cocktail " + this.nume);
    }
}
