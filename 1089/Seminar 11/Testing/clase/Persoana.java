public class Persoana implements IPersoana {
    String nume;
    int varsta;
    String CNP;
    String adresa;
    double salariu;

    public Persoana(String nume, int varsta, String CNP, String adresa, double salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.CNP = CNP;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) throws ExceptiePersoanaVarstaInvalida {
        if(varsta<0)
            throw new ExceptiePersoanaVarstaInvalida();
        this.varsta = varsta;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int calculeazaScorCredit() {
        double scor = ((varsta/15)*salariu)/150;
        return (int) scor;
    }
}
