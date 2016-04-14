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
 *
 * @author Rubiini
 */
public final class ShapeCreator {

    private List<Shape> shape;
    private Random random;
    private int y;
    private int x;

    public ShapeCreator(int y, int x) {
        this.shape = new ArrayList<Shape>();
        shape = createAllShapes(y, x);
        random = new Random();
    }

    /**
     * Alustaa kaikki palat ja tekee niistä listan;
     *
     * @return
     */
    protected List<Shape> createAllShapes(int y, int x) {
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(blockI(y, x));
        shapeList.add(blockO(y, x));
        shapeList.add(blockS(y, x));
        shapeList.add(blockZ(y, x));
        shapeList.add(blockL(y, x));
        shapeList.add(blockJ(y, x));
        shapeList.add(blockT(y, x));
        return shapeList;
    }

    /**
     * Luo I palan seuraavasti: 0 1 2 3
     *
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
     * Luo O palan seuraavasti: 0 1 2 3
     *
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
     * Luo S palan seuraavasti: 1 0 2 3
     *
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
     * Luo Z palan seuraavasti: 0 1 2 3
     *
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
     * Luo L palan seuraavasti: 0 1 2 3
     *
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
     * Luo J palan seuraavasti: 0 1 2 3
     *
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
     * Luo T palan seuraavasti: 0 1 2 3
     *
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
     * Luo uuden listan
     *
     * @return
     */
    protected List<Block> createNewList() {
        List<Block> list = new ArrayList<>();
        return list;
    }

    /**
     * Luo uuden palan
     *
     * @return
     */
    public Shape newShape() {
        int number = random.nextInt(6);
        return shape.get(number);
    }
}
