public class StoneBlock extends Block{
    String type;

    public StoneBlock() {
        type = "Stone Block";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DirtBlock clone = (DirtBlock) super.clone();
        if(type != null) {
            clone.type = type;
        } else {
            clone.type = null;
        }

        return clone;
    }
}
