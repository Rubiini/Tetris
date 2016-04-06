/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.logiikka;

import java.util.HashMap;
import java.util.Random;
import java.util.function.Supplier;
import tetris.palat.IPala;
import tetris.palat.JPala;
import tetris.palat.LPala;
import tetris.palat.OPala;
import tetris.palat.Ruutu;
import tetris.palat.SPala;
import tetris.palat.TPala;
import tetris.palat.ZPala;

/**
 * PalikanArpoja arpoo palan
 * @author samukaup
 */
public class PalikanArpoja {
    private Random random;
    private HashMap<Integer, Supplier<Ruutu>> palat;

    public PalikanArpoja() {
        random = new Random();
        palat = new HashMap<>();
        palat.put(0, () -> new TPala(4, 0));
        palat.put(1, () -> new SPala(4, 0));
        palat.put(2, () -> new ZPala(4, 0));
        palat.put(3, () -> new OPala(4, 0));
        palat.put(4, () -> new IPala(4, 0));
        palat.put(5, () -> new JPala(4, 0));
        palat.put(6, () -> new LPala(4, 0));
    }
    
    /**
     * 
     * @return 
     */
    
    public Ruutu arvoPala() {
        int luku = random.nextInt(6);
        return haePala(luku);       
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    
    public Ruutu haePala(int x) {
        return palat.get(x).get();
    }   
}
