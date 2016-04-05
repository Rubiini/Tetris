package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class LPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public LPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.RED;
    }

    /**
     *
     * @param x
     * @param y
     */
    public LPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
        });
        Color color = Color.RED;
    }

}