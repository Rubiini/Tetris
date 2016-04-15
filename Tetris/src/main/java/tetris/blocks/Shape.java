/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import java.util.List;

/**
 * Palikka, joka koostuu paloista.
 * @author samukaup
 */
public class Shape {
    private int y;
    private int x;
    private List<Block> list;

    /**
     *
     * @param y
     * @param x
     * @param list
     */
    public Shape(int y, int x, List<Block> list) {
        this.y = y;
        this.x = x;
        this.list = list;
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
            block.moveDown();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja ylös.
     */
    public void moveUp() {
        for (Block block : list) {
            block.moveUp();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja vasemmalle.
     */
    public void moveLeft() {
        for (Block block : list) {
            block.moveLeft();
        }
    }

    /**
     * Liikuttaa palikan kaikkia paloja oikealle.
     */
    public void moveRight() {
        for (Block block : list) {
            block.moveRight();
        }
    }

    /**
     *
     */
    /*public void rotate() {
    }*/

}
