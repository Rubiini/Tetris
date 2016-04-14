/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import java.util.List;

/**
 *
 * @author Rubiini
 */
public class Shape {

    private int y;
    private int x;
    private List<Block> list;

    public Shape(int y, int x, List<Block> list) {
        this.y = y;
        this.x = x;
        this.list = list;
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

    public void moveDown() {
        for (Block block : list) {
            block.moveDown();
        }
    }

    public void moveUp() {
        for (Block block : list) {
            block.moveUp();
        }
    }

    public void moveLeft() {
        for (Block block : list) {
            block.moveLeft();
        }
    }

    public void moveRight() {
        for (Block block : list) {
            block.moveRight();
        }
    }

    public void rotate() {
    }
    /*public String toString() {
     Block block = new Block(0, 0);
     for (int i = 0; i < 4; i++) {
     block = list.get(i);
     block.getX();
     System.out.println(list.get(i));
     }
     return null;
     }
    
     public int[][] mapping() {
     for (Block block : list) {
            
     }
     return null;
     }
     */

}
