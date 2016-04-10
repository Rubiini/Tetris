/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tetris.logiikka.PalikanArpoja;
import tetris.palat.Palat;
import tetris.palat.Pelialusta;

/**
 *
 * @author samukaup
 */
public class LogiikkaTest {
    private Palat palat;
    private PalikanArpoja arpoja;
    private Pelialusta pelialusta;
    
    @Before
    public void setUp() {
        pelialusta = new Pelialusta(0 ,0);
        arpoja = new PalikanArpoja();
        palat = arpoja.arvoPala();
    }
    
    @Test
    public void liikutaOikealleToimiiOikein() {
        int luku = palat.getX();
        palat.liikuOikealle();
        
        assertEquals(luku + 1, palat.getX());
    }
    
    @Test
    public void liikutaVasemmalleToimiiOikein() {
        int luku = palat.getX();
        palat.liikuVasemmalle();
        
        assertEquals(luku - 1, palat.getX());
    }
    
    @Test
    public void liikutaAlasToimiiOikein() {
        int luku = palat.getY();
        palat.liikuAlas();
        
        assertEquals(luku + 1, palat.getY());
    }
    
    @Test
    public void liikutaYlosToimiiOikein() {
        int luku = palat.getY();
        palat.liikuYlos();
        
        assertEquals(luku - 1, palat.getY());
    }
    
    @Test
    public void palauttaakoTormaysVasempaanSeinaanTrueOikein() {
        
    }
    
    @Test
    public void palauttaakoTormaysVasempaanSeinaanFalseOikein() {
        
    }
    
    @Test
    public void palauttaakoTormaysOikeaanSeinaanTrueOikein() {
        
    }
    
    @Test
    public void palauttaakoTormaysOikeaanSeinaanFalseOikein() {
        
    }
    
    @Test
    public void palauttaakoTormaysLattiaanTrueOikein() {
        
    }
    
    @Test
    public void palauttaakoTormaysLattiaanFalseOikein() {
        
    }
}
