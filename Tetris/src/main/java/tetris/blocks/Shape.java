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

    private List<Block> list;

    public Shape(List<Block> list) {
        this.list = list;
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
