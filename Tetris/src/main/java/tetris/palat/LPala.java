package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class LPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public LPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.RED;
    }

    /**
     *
     * @param x
     * @param y
     */
    public LPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {4, 4, 4, 0},
            {4, 0, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.RED;
    }

}