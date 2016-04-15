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
     * Liikuttaa palan alas.
     */
    public void moveDown() {
        y++;
    }

    /**
     * Liikuttaa palan ylös.
     */
    public void moveUp() {
        y--;
    }

    /**
     * Liikuttaa palan vasemmalle.
     */
    public void moveLeft() {
        x--;
    }

    /**
     * Liikuttaa palan oikealle.
     */
    public void moveRight() {
        x++;
    }
}
