public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
