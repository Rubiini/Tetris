/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tetris.logiikka.PalikanArpoja;
import tetris.palat.Ruutu;
import tetris.palat.SPala;

/**
 *
 * @author samukaup
 */
public class PalikanArpojaTest {
    private PalikanArpoja arpoja;

    @Before
    public void setUp() {
        arpoja = new PalikanArpoja();
    }
    
    @Test
    public void arvoPalaOsaaPalauttaaPalanOikein() {
        assertTrue(arpoja.arvoPala() instanceof Ruutu);
    }
    
    @Test
    public void haePalaHakeeOikein() {
        assertTrue(arpoja.haePala(1) instanceof SPala);
    }

}
