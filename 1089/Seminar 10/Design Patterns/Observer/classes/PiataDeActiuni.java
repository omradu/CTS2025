public class PiataDeActiuni {
    ArrayList<ObservatorActiuni> observatoriActiuni = new ArrayList<>();

    public void inregistreazaObservator(ObservatorActiuni observator) {
        this.observatoriActiuni.add(observator);
    }

    public void stergeObservator(ObservatorActiuni observator) {
        this.observatoriActiuni.remove(observator);
    }

    public void notificaObservatori(String simbolActiune, double pret) {
        for (ObservatorActiuni observator : observatoriActiuni) {
            observator.actualizarePret(simbolActiune, pret);
        }
    }
}
