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
 * Luo kaikki palat.
 *
 * @author Rubiini
 */
public final class ShapeCreator {

    private List<Shape> shapeList;
    private Random random;
    private int y;
    private int x;

    /**
     *
     * @param y
     * @param x
     */
    public ShapeCreator(int y, int x) {
        this.shapeList = new ArrayList<>();
        shapeList = createAllShapes(y, x);
        random = new Random();
    }

    /**
     * Alustaa kaikki palat ja tekee niistä listan.
     *
     * @param y
     * @param x
     * @return
     */
    protected List<Shape> createAllShapes(int y, int x) {
        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(blockI(y, x));
        listOfShapes.add(blockO(y, x));
        listOfShapes.add(blockS(y, x));
        listOfShapes.add(blockZ(y, x));
        listOfShapes.add(blockL(y, x));
        listOfShapes.add(blockJ(y, x));
        listOfShapes.add(blockT(y, x));
        return listOfShapes;
    }

    /**
     * Luo I palan seuraavasti. 
     *
     * 0 1 2 3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockI(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y, x + 2));
        list.add(new Block(y, x + 3));
        return new Shape(y, x, list);
    }

    /**
     * Luo O palan seuraavasti. 
     * 0 1 
     * 2 3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockO(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y + 1, x));
        list.add(new Block(y + 1, x + 1));
        return new Shape(y, x, list);
    }

    /**
     * Luo S palan seuraavasti. 
     *   1 0 
     * 2 3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockS(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x + 2));
        list.add(new Block(y, x + 1));
        list.add(new Block(y + 1, x));
        list.add(new Block(y + 1, x + 1));
        return new Shape(y, x, list);
    }

    /**
     * Luo Z palan seuraavasti.
     * 0 1 
     *   2 3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockZ(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y + 1, x + 1));
        list.add(new Block(y + 1, x + 2));
        return new Shape(y, x, list);
    }

    /**
     * Luo L palan seuraavasti.
     * 0 1 2
     * 3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockL(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y, x + 2));
        list.add(new Block(y + 1, x));
        return new Shape(y, x, list);
    }

    /**
     * Luo J palan seuraavasti. 
     * 0 1 2 
     *     3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockJ(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y, x + 2));
        list.add(new Block(y + 1, x + 2));
        return new Shape(y, x, list);
    }

    /**
     * Luo T palan seuraavasti.
     * 0 1 2 
     *   3
     * @param y
     * @param x
     * @return
     */
    protected Shape blockT(int y, int x) {
        List<Block> list = createNewList();
        list.add(new Block(y, x));
        list.add(new Block(y, x + 1));
        list.add(new Block(y, x + 2));
        list.add(new Block(y + 1, x + 1));
        return new Shape(y, x, list);
    }

    /**
     * Luo uuden listan.
     *
     * @return
     */
    protected List<Block> createNewList() {
        List<Block> list = new ArrayList<>();
        return list;
    }

    /**
     * Luo uuden palan.
     *
     * @return
     */
    public Shape newShape() {
        int number = random.nextInt(6);
        return shapeList.get(number);
    }
}
