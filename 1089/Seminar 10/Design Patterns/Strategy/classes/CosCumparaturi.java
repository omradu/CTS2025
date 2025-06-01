public class CosCumparaturi {
    double suma;
    String usernameClient;

    IPlata metodaPlata = null;

    public CosCumparaturi(double suma, String usernameClient) {
        this.suma = suma;
        this.usernameClient = usernameClient;
    }

    public void efectueazaPlata() {
        if(metodaPlata !=null) {
            this.metodaPlata.plateste(this.suma);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
}
