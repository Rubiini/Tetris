package tetris.palat;

import java.awt.Color;
import tetris.logiikka.PalikanArpoja;

/**
 *
 * @author samukaup
 */
public class Pelialusta {

    public static final int VAAKA = 10;
    public static final int PYSTY = 20;
    
    public int[][] alusta;
    
    private PalikanArpoja arpoja;
    private int[] sijainti;
    
    
    public Pelialusta() {
        alusta = new int[VAAKA][PYSTY];
        for (int i = 0; i < VAAKA; i++) {
            for (int j = 0; j < PYSTY; j++) {
                alusta[i][j] = 0;
            }
        }
    }

    
    
    
}
    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    /* public Pelialusta(int x, int y, int[][] palikka) {
     super(x, y, palikka);
     Color color = Color.BLACK;
     }

     /**
     *
     * @param x
     * @param y
     */
    /* public Pelialusta(int x, int y) {
     this(x, y, new int[][]{
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
     });
     Color color = Color.BLACK;
     }
     */

