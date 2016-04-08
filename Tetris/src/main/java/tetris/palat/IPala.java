/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.palat;

import java.awt.Color;

/**
 *
 * @author samukaup
 */
public class IPala extends Ruutu {

    /**
     *
     * @param x
     * @param y
     * @param palikka
     */
    public IPala(int x, int y, int[][] palikka) {
        super(x, y, palikka);
        Color color = Color.MAGENTA;
    }

    /**
     *
     * @param x
     * @param y
     */
    public IPala(int x, int y) {
        this(x, y, new int[][]{
            {0, 0, 0, 0},
            {2, 2, 2, 2},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        });
        Color color = Color.MAGENTA;
    }

    
}
