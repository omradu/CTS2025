public abstract class PersonalSpital {
    private String nume;
    private float salariu;

    public PersonalSpital(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personal Medical: ");
        sb.append("Nume: ").append(nume).append(" -> salariu: ").append(salariu);
        return sb.toString();
    }
}
