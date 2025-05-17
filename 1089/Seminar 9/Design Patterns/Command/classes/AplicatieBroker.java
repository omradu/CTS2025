public class AplicatieBroker {
    private List<Ordin> ordine = new ArrayList<>();

    public void adaugareOrdin(Ordin ordin) {
        ordine.add(ordin);
    }

    public void trimiteOrdineSpreExecutie() {
        for(Ordin ordin : ordine) {
            ordin.executareOrdin(ordin.nrActiuni);
        }
    }
}
