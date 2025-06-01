public class AplicatieBroker implements ObservatorActiuni {
    @Override
    public void actualizarePret(String simbolActiune, double pretActiune) {
        System.out.println("Prețul pentru " + simbolActiune + " este acum: $" + pretActiune);
    }
}
