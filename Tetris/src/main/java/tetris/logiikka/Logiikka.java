/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.logiikka;

import tetris.palat.Palat;
import tetris.palat.Pelialusta;
import tetris.palat.Ruutu;

/**
 * Vastaa pelin logiikasta.
 * @author samukaup
 */
public class Logiikka {
    
    /**
     * Arpoo ja luo uuden kuvion.
     */
    private PalikanArpoja arpoja;
    
    /**
     * Luo pelialustan.
     */
    private Pelialusta pelialusta;

    /**
     * Kontroloi palaa.
     */
    private Palat palat;
    
    public Logiikka() {
        arpoja = new PalikanArpoja();
        pelialusta = new Pelialusta(0, 0);
        palat = arpoja.arvoPala();
    }
    
    /**
     * 
     * @param palat 
     */
    public void setPalat(Ruutu palat) {
        this.palat = palat;
    }
    
    /**
     * Liikuttaa palaa oikealle
     */
    
    public void liikutaOikealle() {
        palat.liikuOikealle();
    }
    
    /**
     * Liikuttaa palaa vasemmalle
     */
    
    public void liikutaVasemmalle() {
        palat.liikuVasemmalle();
    }
    
    /**
     * Liikuttaa palaa alas
     */
    
    public void liikutaAlas() {
        palat.liikuAlas();
    }
    
    /**
     * Liikuttaa palaa ylös
     */
    
    public void liikutaYlos() {
        palat.liikuYlos();
    }
    
    /**
     * Kääntää palan
     */
    
    public void kaanna() {
        palat.kaanna();
    }
    
}
