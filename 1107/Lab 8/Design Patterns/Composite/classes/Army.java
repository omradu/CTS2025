ublic class Army extends AbstractEnemy{
    ArrayList<AbstractEnemy> enemies = new ArrayList<>();

    public Army(String name) {
        super(name);
    }

    @Override
    public void atack(String weapon) {
        System.out.println(this.name + " attaks");
        for(AbstractEnemy enemy : this.enemies) {
            enemy.atack(weapon);
        }
    }

    @Override
    public void defend() {
        System.out.println(this.name + " defends");
        for(AbstractEnemy enemy : this.enemies) {
            enemy.defend();
        }
    }

    @Override
    public void heal() {
        System.out.println(this.name + " is healing");
        for(AbstractEnemy enemy : this.enemies) {
            enemy.heal();
        }
    }

    @Override
    public void addEnemy(AbstractEnemy node) {
        this.enemies.add(node);
    }

    @Override
    public void deleteEnemy(int index) {
        if(index>=0 && index<enemies.size()) {
            System.out.println("Enemy " + this.enemies.get(index).getName() + " is deleted");
            this.enemies.remove(index);
        }
    }

    @Override
    public AbstractEnemy getEnemy(String name) {
        AbstractEnemy reference= null;
        for(AbstractEnemy enemy : enemies)
            if(enemy.getName().equals(name))
                reference = enemy;

        return reference;
    }
}
