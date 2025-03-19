public class Main {
    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();

        PersonalSpital medic = simpleFactory.createPersonal(TipPersonal.MEDIC, "Marius", 7800);
        PersonalSpital asistent = simpleFactory.createPersonal(TipPersonal.ASISTENT, "Ionica", 4000);
        PersonalSpital brancardier = SimpleFactory.createPersonal(TipPersonal.BRANCARDIER, "Gigel", 3700);

        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(brancardier.toString());
    }
}
