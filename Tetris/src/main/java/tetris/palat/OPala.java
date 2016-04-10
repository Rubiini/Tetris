package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class OPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public OPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.YELLOW;
    }

    /**
     *
     * @param x
     * @param y
     */
    public OPala(int y, int x) {
        this(y, x, new int[][]{
            {0, 0, 0, 0},
            {0, 7, 7, 0},
            {0, 7, 7, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.YELLOW;
    }

}
