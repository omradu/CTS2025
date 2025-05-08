public class Enemy extends AbstractEnemy{
    public Enemy(String name) {
        super(name);
    }

    @Override
    public void atack(String weapon) {
        System.out.println("    " + this.name + " attacks with " + weapon);
    }

    @Override
    public void defend() {
        System.out.println("    " + this.name + " is defending");
    }

    @Override
    public void heal() {
        System.out.println("    " + this.name + " is helaing");
    }

    @Override
    public void addEnemy(AbstractEnemy node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteEnemy(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractEnemy getEnemy(String name) {
        throw new UnsupportedOperationException();
    }
}
