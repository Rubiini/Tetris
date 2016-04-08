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
 *
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
     *
     */
    private Ruutu palikka;

    public Logiikka() {
        pelialusta = new Pelialusta(10, 20);
        arpoja = new PalikanArpoja();
        palikka = arpoja.arvoPala();
    }

    /**
     *
     * @param palat
     */
    public void setPalat(Ruutu palat) {
        this.palikka = palat;
    }

    /**
     * Liikuttaa palaa oikealle
     */
    public void liikutaOikealle() {
        palikka.liikuOikealle();
    }

    /**
     * Liikuttaa palaa vasemmalle
     */
    public void liikutaVasemmalle() {
        palikka.liikuVasemmalle();
    }

    /**
     * Liikuttaa palaa alas
     */
    public void liikutaAlas() {
        palikka.liikuAlas();
    }

    /**
     * Liikuttaa palaa ylös
     */
    public void liikutaYlos() {
        palikka.liikuYlos();
    }

    /**
     * Kääntää palan
     */
    public void kaanna() {
        palikka.kaanna();
    }

    public void lisaaPalaPelialustaan() {

    }

    public boolean tormaakoPelialustaan() {
        pelialusta.liikuAlas();
        int ruutu;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                ruutu = palikka.getKoordinaatti(y, x);
                
                if (ruutu > 1) {
                    
                }
            }

        }
        return false;
    }

}
