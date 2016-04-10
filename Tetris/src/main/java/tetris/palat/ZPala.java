package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class ZPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public ZPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.GREEN;
    }

    /**
     *
     * @param y
     * @param x
     */
    public ZPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {6, 6, 0, 0},
            {0, 6, 6, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.GREEN;
    }

    
}