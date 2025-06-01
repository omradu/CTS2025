public class Personaj {
    public static final int PRAG = 100;

    String nume;
    int energie = 100;

    IMiscare tipMiscare = new MiscareEnergica();

    public Personaj(String nume) {
        this.nume = nume;
    }

    public void misca() {
        this.tipMiscare.misca();
    }

    public void seJoaca(int puncte) {
        this.energie -= puncte;
        if(this.energie<PRAG) {
            this.tipMiscare = new MiscareObosita();
        }
    }

    public void doarme(int puncte) {
        this.energie += puncte;
        if(this.energie>=PRAG) {
            this.tipMiscare = new MiscareEnergica();
        }
    }
}
