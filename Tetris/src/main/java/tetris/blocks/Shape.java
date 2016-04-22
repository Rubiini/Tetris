/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import java.util.ArrayList;
import java.util.List;
import static tetris.blocks.Direction.*;

/**
 * Palikka, joka koostuu paloista.
 *
 * @author samukaup
 */
public class Shape {

    private int y;
    private int x;
    private int num;
    private List<Block> list;
    private Direction direction;

    /**
     *
     * @param y
     * @param x
     * @param num
     * @param list
     */
    public Shape(int y, int x, int num, List<Block> list) {
        this.y = y;
        this.x = x;
        this.num = num;
        this.list = list;
        this.direction = RIGHT;
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
     * @param y
     */
    public void setY(int y) {
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
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public List<Block> getList() {
        return list;
    }

    /**
     *
     * @param list
     */
    public void setList(List<Block> list) {
        this.list = list;
    }

    /**
     * Liikuttaa palikan kaikkia paloja alas.
     */
    public void moveDown() {
        for (Block block : list) {
            y++;
            block.moveDown();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja ylös.
     */
    public void moveUp() {
        for (Block block : list) {
            y--;
            block.moveUp();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja vasemmalle.
     */
    public void moveLeft() {
        for (Block block : list) {
            x--;
            block.moveLeft();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja oikealle.
     */
    public void moveRight() {
        for (Block block : list) {
            x++;
            block.moveRight();
        }
    }

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

    public boolean rotateI() {
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

        return true;
    }

    public boolean rotateS() {
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

        return true;
    }

    public boolean rotateZ() {
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

        return true;
    }

    public boolean rotateL() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 2);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 2);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 2);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 0);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 0);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 2);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 0);
            direction = RIGHT;
        }

        return true;
    }

    public boolean rotateJ() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 0);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 1);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 0);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 2);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 0);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 0);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 0);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 2);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 2);
            direction = RIGHT;
        }

        return true;
    }

    public boolean rotateT() {
        if (direction == RIGHT) {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 2);
            direction = UP;
        } else if (direction == UP) {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 2);
            this.getList().get(3).setY(y + 1);
            direction = LEFT;
        } else if (direction == LEFT) {
            this.getList().get(0).setX(x + 0);
            this.getList().get(0).setY(y + 1);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 2);
            this.getList().get(2).setY(y + 1);
            this.getList().get(3).setX(x + 1);
            this.getList().get(3).setY(y + 0);
            direction = DOWN;
        } else {
            this.getList().get(0).setX(x + 1);
            this.getList().get(0).setY(y + 2);
            this.getList().get(1).setX(x + 1);
            this.getList().get(1).setY(y + 1);
            this.getList().get(2).setX(x + 1);
            this.getList().get(2).setY(y + 0);
            this.getList().get(3).setX(x + 0);
            this.getList().get(3).setY(y + 1);
            direction = RIGHT;
        }

        return true;
    }

}
