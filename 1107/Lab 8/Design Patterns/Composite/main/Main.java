public class Main {
    public static void main(String[] args) {
        Army bossArmy2 = new Army("Boss army");
        Enemy enemy = new Enemy("Gigel");
        Enemy enemy2 = new Enemy("Ionel");
        Enemy enemy3 = new Enemy("Marcel");
        Army wave12 = new Army("Wave 1");
        Army wave22 = new Army("Wave 2");

        wave12.addEnemy(enemy);
        wave22.addEnemy(enemy2);
        wave22.addEnemy(enemy3);
        wave22.addEnemy(wave12);

        bossArmy2.addEnemy(wave22);

        bossArmy2.atack("Gun");

    }
}
