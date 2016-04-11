package tetris.blocks;

/**
 * 
 * @author Rubiini
 */
public class Block {

    private int x;
    private int y;

    public Block(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveDown() {
        y++;
    }

    public void moveUp() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}
