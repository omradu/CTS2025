public class Investitor implements ObservatorActiuni {
    String nume;

    public Investitor(String nume) {
        this.nume = nume;
    }

    @Override
    public void actualizarePret(String simbolActiune, double pretActiune) {
        System.out.println("Salut " + this.nume + ", prețul pentru " + simbolActiune + " este acum: $" + pretActiune);
    }
}
