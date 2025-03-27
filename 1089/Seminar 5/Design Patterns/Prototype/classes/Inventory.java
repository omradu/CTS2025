public class Inventory {
    private HashMap<String, Block> inventory = new HashMap<>();

    public  Inventory() {
        inventory.put("Dirt", new DirtBlock());
        inventory.put("Stone", new StoneBlock());
    }

    public Block getBlock(String type) {
        try {
            return (Block) inventory.get(type).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
