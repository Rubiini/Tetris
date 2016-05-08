package tetris.blocks;

import java.util.ArrayList;
import java.util.List;
import static tetris.blocks.Direction.*;

/**
 * Palikka(Shape), joka koostuu paloista(Block).
 *
 * @author samukaup
 */
public class Shape {

    private int y;
    private int x;
    private int num;
    private List<Block> list;
    private Direction direction;
    
    //abstract public void rotate(Direction direction, int y, int x);

    /**
     * Asettaa palikalle y ja x koordinaattit, muodon numeron ja listan paloista.
     * @param y Koordinaatti korkeus-suunnassa
     * @param x Koordinaatti leveys-suunnassa
     * @param num Palikan mallin kertova tunniste
     * @param list Lista palikkaan kuuluvista paloista
     */
    public Shape(int y, int x, int num, List<Block> list) {
        this.y = y;
        this.x = x;
        this.num = num;
        this.list = list;
        this.direction = RIGHT;
    }

    public int getNum() {
        return num;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public List<Block> getList() {
        return list;
    }

    public void setList(List<Block> list) {
        this.list = list;
    }

    /**
     * Liikuttaa palikan kaikkia paloja alas ja samalla liikuttaa palikan omaa sijaintia.
     */
    public void moveDown() {
        for (Block block : list) {
            block.moveDown();
        }
        y++;
    }

    /**
     * Liikuttaa palikan kaikkia paloja ylös ja samalla liikuttaa palikan omaa sijaintia.
     */
    public void moveUp() {
        for (Block block : list) {
            block.moveUp();
        }
        y--;
    }

    /**
     * Liikuttaa palikan kaikkia paloja vasemmalle ja samalla liikuttaa palikan omaa sijaintia.
     */
    public void moveLeft() {
        for (Block block : list) {
            block.moveLeft();
        }
        x--;
    }

    /**
     * Liikuttaa palikan kaikkia paloja oikealle ja samalla liikuttaa palikan omaa sijaintia.
     */
    public void moveRight() {
        for (Block block : list) {
            block.moveRight();
        }
        x++;
    }

    /**
     * Tarkastaa palikan mallin ja kutsuu oikeaa rotate metodia.
     */
    public void shapeCheck() {
        if (num == 0) {
            rotateI();
        } else if (num == 1) {
            return;
        } else if (num == 2) {
            rotateS();
        } else if (num == 3) {
            rotateZ();
        } else if (num == 4) {
            rotateL();
        } else if (num == 5) {
            rotateJ();
        } else {
            rotateT();
        }
    }

    /**
     * Kääntää I palikan.
     */
    public void rotateI() {
        if (direction == RIGHT || direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 2);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 3);
            direction = UP;
        } else {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 3);
            this.getList().get(3).setY(y + 1);
            direction = RIGHT;
        }
    }

    /**
     * Kääntää S palikan.
     */
    public void rotateS() {
        if (direction == RIGHT || direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 2);
            direction = UP;
        } else {
            this.getList().get(0).setX(x + 2);
            this.getList().get(0).setY(y);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y);
            this.getList().get(2).setX(x);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 1);
            direction = RIGHT;
        }
    }

    /**
     * Kääntää Z Palikan.
     */
    public void rotateZ() {
        if (direction == RIGHT || direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 0);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 2);
            direction = UP;
        } else {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 0);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 1);
            direction = RIGHT;
        }
    }

    /**
     * Kääntää L palikkan.
     */
    public void rotateL() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 2);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 2);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 0);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 0);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 2);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 0);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 2);
            direction = RIGHT;
        }
    }

    /**
     * Kääntää J palikan.
     */
    public void rotateJ() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 0);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 2);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 0);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 0);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 2);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 2);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 0);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 1);
            direction = RIGHT;
        }
    }

    /**
     * Kääntää T palikan.
     */
    public void rotateT() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 1);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 0);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 1);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 2);
            direction = RIGHT;
        }
    }
}
