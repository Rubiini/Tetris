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
        this.x = x;
        this.y = y;
        random = new Random();
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
        return new Shape(y, x, 0, list);
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
        return new Shape(y, x, 1, list);
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
        return new Shape(y, x, 2, list);
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
        return new Shape(y, x, 3, list);
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
        return new Shape(y, x, 4, list);
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
        return new Shape(y, x, 5, list);
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
        return new Shape(y, x, 6, list);
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
        if (number == 0) return blockI(y, x);
        if (number == 1) return blockO(y, x);
        if (number == 2) return blockS(y, x);
        if (number == 3) return blockZ(y, x);
        if (number == 4) return blockL(y, x);
        if (number == 5) return blockJ(y, x);
        if (number == 6) return blockT(y, x);
        return null;
    }
}
