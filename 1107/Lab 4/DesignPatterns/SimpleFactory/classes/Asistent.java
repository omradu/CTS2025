public class Asistent extends PersonalSpital{

    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
