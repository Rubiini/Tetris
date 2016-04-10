package tetris.palat;

import java.awt.Color;
import tetris.logiikka.PalikanArpoja;

/**
 *
 * @author samukaup
 */
public class Pelialusta extends Palikka{

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public Pelialusta(int y, int x, int[][] palikka) {
     super(y, x, palikka);
     Color color = Color.BLACK;
     }

     /**
     *
     * @param x
     * @param y
     */
    public Pelialusta(int y, int x) {
     this(y, x, new int[][]{
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
     {0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 0}
             
     
     });
     Color color = Color.BLACK;
     }
    
}

    /*
    public static final int VAAKA = 10;
    public static final int PYSTY = 20;
    public Ruutu[][] alusta;
    
    private PalikanArpoja arpoja;
    private int[][] sijainti;
    private Ruutu palikka;
    
    
    public Pelialusta() {
        alusta = new Ruutu[VAAKA][PYSTY];
        arpoja = new PalikanArpoja();
        palikka = arpoja.arvoPala();
        sijainti = new int[0][5];
        for (int i = 0; i < VAAKA; i++) {
            for (int j = 0; j < PYSTY; j++) {
                alusta[i][j] = 0;
            }
        }
    }

    
    public void lisaaPalikka(Ruutu pala) {
        alusta[pala.getX()][pala.getY()] = pala;
        
    }
    
    public boolean poistaRivi() {
        for (int x = 0; x < VAAKA; x++) {
            for (int y = 0; y < PYSTY; y++) {
                if (alusta[x][y] == null) {
                    
                }
            }
        }
        
        return false;
    }*/

