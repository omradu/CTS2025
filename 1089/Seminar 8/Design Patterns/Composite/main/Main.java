public class Main {
    public static void main(String[] args) {
        Armata bossArmy = new Armata("Boss army");
        Luptator soldat = new Luptator("Marcel");
        Luptator general = new Luptator("Ionel");
        Armata val1 = new Armata("Armata din valul 1");
        Luptator soldat1 = new Luptator("Gica");
        Luptator soldat2 = new Luptator("Gigel");
        Armata val2 = new Armata("Armata din valul 2");
        Luptator soldat3 = new Luptator("Mihai");
        Luptator soldat4 = new Luptator("Razvan");

        val2.adaugaLuptator(val1);
        val2.adaugaLuptator(soldat3);
        val2.adaugaLuptator(soldat4);
        val1.adaugaLuptator(soldat1);
        val1.adaugaLuptator(soldat2);
        bossArmy.adaugaLuptator(val2);
        bossArmy.adaugaLuptator(soldat);
        bossArmy.adaugaLuptator(general);

        bossArmy.ataca("pistol");
    }
}
