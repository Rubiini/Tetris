package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class ZPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public ZPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.GREEN;
    }

    /**
     *
     * @param x
     * @param y
     */
    public ZPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.GREEN;
    }

}