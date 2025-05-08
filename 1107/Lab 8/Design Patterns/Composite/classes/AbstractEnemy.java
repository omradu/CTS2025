public abstract class AbstractEnemy {

    protected String name;

    public AbstractEnemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //methods specific to leaf nodes and composite nodes
    public abstract void atack(String weapon);
    public abstract void defend();
    public abstract void heal();

    //methods specific to composite nodes
    public abstract void addEnemy(AbstractEnemy node);
    public abstract void deleteEnemy(int index);
    public abstract AbstractEnemy getEnemy(String name);
}
