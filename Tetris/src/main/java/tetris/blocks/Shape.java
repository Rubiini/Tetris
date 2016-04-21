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

    public Shape rotate() {
        List<Block> blocks = new ArrayList<>();
        for (Block block : list) {
            int oldX = block.getX();
            int oldY = block.getY();
            
            if (direction == RIGHT) {

            }
        }
        return this;
    }

    public void shapeCheck() {
        if (num == 0) {
            rotateLine();
        } else if (num == 1) {
            return;
        } else {
            rotate();
        }
    }

    public boolean rotateLine() {

        return true;
    }
}
