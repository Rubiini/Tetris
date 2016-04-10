package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class SPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public SPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.ORANGE;
    }

    /**
     *
     * @param x
     * @param y
     */
    public SPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {0, 8, 8, 0},
            {8, 8, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.ORANGE;
    }

    
}