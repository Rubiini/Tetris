package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class OPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public OPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.YELLOW;
    }

    /**
     *
     * @param x
     * @param y
     */
    public OPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.YELLOW;
    }

}
