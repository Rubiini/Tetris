package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class JPala extends Palikka {

    /**
     *
     * @param y
     * @param x
     * @param palikka
     */
    public JPala(int y, int x, int[][] palikka) {
        super(y, x, palikka);
        Color color = Color.BLUE;
    }

    /**
     *
     * @param x
     * @param y
     */
    public JPala(int y, int x) {
        this(y, x, new int[][]{
            {3, 0, 0, 0},
            {3, 3, 3, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.BLUE;
    }

}