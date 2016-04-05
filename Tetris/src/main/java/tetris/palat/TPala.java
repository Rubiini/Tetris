package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class TPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public TPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.CYAN;
    }

    /**
     *
     * @param x
     * @param y
     */
    public TPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 0},
            {1, 1, 1},
            {0, 1, 0}
        });
        Color color = Color.CYAN;
    }

    
}