package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class JPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    
    public JPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.BLUE;
    }

    /**
     *
     * @param x
     * @param y
     */
    
    public JPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.BLUE;
    }

}