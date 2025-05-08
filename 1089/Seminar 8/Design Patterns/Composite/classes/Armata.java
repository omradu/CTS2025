public class Armata extends LuptatorAbstract {

    ArrayList<LuptatorAbstract> luptatori = new ArrayList<>();

    public Armata(String nume) {
        super(nume);
    }

    @Override
    public void ataca(String arma) {
        for(LuptatorAbstract luptator : this.luptatori) {
            luptator.ataca(arma);
        }
        System.out.println("            " + this.nume + " a terminat lupta");
    }

    @Override
    public void seApara() {
        for(LuptatorAbstract luptator : this.luptatori) {
            luptator.seApara();
        }
    }

    @Override
    public void seVindeca() {
        for(LuptatorAbstract luptator : this.luptatori) {
            luptator.seVindeca();
        }
    }

    @Override
    public void adaugaLuptator(LuptatorAbstract nod) {
        this.luptatori.add(nod);
    }

    @Override
    public void stergeLuptator(int index) {
        if(index>=0 && index<luptatori.size()) {
            System.out.println("Luptatorul " + this.luptatori.get(index).getNume() + " a fost sters");
            this.luptatori.remove(index);
        }

    }

    @Override
    public LuptatorAbstract getLuptator(String nume) {
        LuptatorAbstract referinta = null;
        for(LuptatorAbstract luptator : luptatori)
            if(luptator.getNume().equals(nume))
                referinta = luptator;

        return referinta;
    }
}
