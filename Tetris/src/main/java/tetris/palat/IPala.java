package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class IPala extends Palikka {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public IPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.MAGENTA;
    }

    /**
     *
     * @param x
     * @param y
     */
    public IPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {2, 2, 2, 2},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.MAGENTA;
    }

    
}
