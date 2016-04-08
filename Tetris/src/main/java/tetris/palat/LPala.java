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
            {0, 4, 0, 0},
            {0, 4, 0, 0},
            {0, 4, 4, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.RED;
    }

}