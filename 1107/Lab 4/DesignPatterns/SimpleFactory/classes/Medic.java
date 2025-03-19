public class Medic extends PersonalSpital{

    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
