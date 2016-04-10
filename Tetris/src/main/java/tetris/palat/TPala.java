package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class TPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public TPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.CYAN;
    }

    /**
     *
     * @param y
     * @param x
     */
    public TPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {5, 5, 5, 0},
            {0, 5, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.CYAN;
    }

    
}