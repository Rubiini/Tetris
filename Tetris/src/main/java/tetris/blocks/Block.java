package tetris.blocks;

/**
 * Pala
 * @author samukaup
 */
public class Block {

    private int x;
    private int y;

    /**
     *
     * @param y
     * @param x
     */
    public Block(int y, int x) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     */
    public void moveDown() {
        y++;
    }

    /**
     *
     */
    public void moveUp() {
        y--;
    }

    /**
     *
     */
    public void moveLeft() {
        x--;
    }

    /**
     *
     */
    public void moveRight() {
        x++;
    }
}
