package tetris.palat;

import java.awt.Color;

/**
 * Pelialusta ja palat koostuvat ruuduista.
 * @author samukaup
 */
public abstract class Ruutu implements Palat {
    
    private int x;
    private int y;
    private int[][] palikka;
    private Color vari;

    /**
     * 
     * @param x
     * @param y
     * @param palikka
     * @param vari 
     */
    
    public Ruutu(int x, int y, int[][] palikka) {
        this.x = x;
        this.y = y;
        this.palikka = palikka;
        this.vari = Color.BLACK;
    }

    /**
     * 
     * @return 
     */
    
    public int getX() {
        return x;
    }

    /**
     * 
     * @param x 
     */
    
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 
     * @return 
     */
    
    public int getY() {
        return y;
    }

    /**
     * 
     * @param y 
     */
    
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 
     * @return 
     */
    
    public int[][] getPalikka() {
        return palikka;
    }

    /**
     * 
     * @param palikka 
     */
    
    public void setPalikka(int[][] palikka) {
        this.palikka = palikka;
    }
    
    /**
     * 
     * @return 
     */
    
    public int liikuYlos() {
        return y--;
    }
    
    /**
     * 
     * @return 
     */
    
    public int liikuAlas() {
        return y++;
    }
    
    /**
     * 
     * @return 
     */
    
    public int liikuVasemmalle() {
        return x--;
    }
    
    /**
     * 
     * @return 
     */
    
    public int liikuOikealle() {
        return x++;
    }
    
    
    public void kaanna() {
        final int korkeus = palikka.length;
        final int leveys = palikka[0].length;
        int [][] uusiPalikka = new int[leveys][korkeus];
        
        for (int y = 0; y < korkeus; y++) {
            for (int x = 0; x < leveys; x++) {
                uusiPalikka[x][korkeus - 1 - y] = palikka[y][x];
            }
        }
        this.palikka = uusiPalikka;
    }   
}
