/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Luo kaikki palat
 * @author Rubiini
 */
public final class ShapeCreator {
    
    private List<Shape> shape;
    private Random random;

    public ShapeCreator() {
        this.shape = new ArrayList<Shape>();
        shape = createAllShapes();
        random = new Random();
    }
    
    /**
     * Alustaa kaikki palat ja tekee niistä listan;
     * @return 
     */
    protected List<Shape> createAllShapes() {
        List<Shape> pieceList = new ArrayList<Shape>();
        pieceList.add(blockI());
        pieceList.add(blockO());
        pieceList.add(blockS());
        pieceList.add(blockZ());
        pieceList.add(blockL());
        pieceList.add(blockJ());
        pieceList.add(blockT());
        return pieceList;
    }
    
    /**
     * Luo I palan seuraavasti:
     * 0 1 2 3
     * @return 
     */
    protected Shape blockI() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(0, 2));
        list.add(new Block(0, 3));
        return new Shape(list);
    }
    /**
     * Luo O palan seuraavasti:
     * 0 1
     * 2 3
     * @return 
     */
    protected Shape blockO() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(1, 0));
        list.add(new Block(1, 1));
        return new Shape(list);
    }
    
    /**
     * Luo S palan seuraavasti:
     *   1 0
     * 2 3
     * @return 
     */
    protected Shape blockS() {
        List<Block> list = createNewList();
        list.add(new Block(0, 2));
        list.add(new Block(0, 1));
        list.add(new Block(1, 0));
        list.add(new Block(1, 1));
        return new Shape(list);
    }
    
    /**
     * Luo Z palan seuraavasti:
     * 0 1 
     *   2 3
     * @return 
     */
    protected Shape blockZ() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(1, 1));
        list.add(new Block(1, 2));
        return new Shape(list);
    }
    
    /**
     * Luo L palan seuraavasti:
     * 0 1 2
     * 3
     * @return 
     */
    protected Shape blockL() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(0, 2));
        list.add(new Block(1, 0));
        return new Shape(list);
    }
    /**
     * Luo J palan seuraavasti:
     * 0 1 2
     *     3
     * @return 
     */
    protected Shape blockJ() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(0, 2));
        list.add(new Block(1, 2));
        return new Shape(list);
    }
    
    /**
     * Luo T palan seuraavasti:
     * 0 1 2
     *   3
     * @return 
     */
    protected Shape blockT() {
        List<Block> list = createNewList();
        list.add(new Block(0, 0));
        list.add(new Block(0, 1));
        list.add(new Block(0, 2));
        list.add(new Block(1, 1));
        return new Shape(list);
    }
    /**
     * Luo uuden listan
     * @return 
     */
    protected List<Block> createNewList() {
        List<Block> list = new ArrayList<>();
        return list;
    }
    
    /**
     * Luo uuden palan
     * @return 
     */
    public Shape newShape() {
        int number = random.nextInt(6);
        return shape.get(number);
    }
}
