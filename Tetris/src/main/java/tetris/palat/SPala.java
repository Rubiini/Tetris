package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class SPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public SPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.ORANGE;
    }

    /**
     *
     * @param x
     * @param y
     */
    public SPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 0, 0},
            {0, 8, 8, 0},
            {8, 8, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.ORANGE;
    }

    
}