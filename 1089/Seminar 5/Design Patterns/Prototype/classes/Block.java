public abstract class Block implements Cloneable {
    int length;
    int height;
    int depth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Object clone() throws CloneNotSupportedException {
        Block clone = (Block) super.clone();
        clone.length = length;
        clone.height = height;
        clone.depth = depth;

        return clone;
    }

}
