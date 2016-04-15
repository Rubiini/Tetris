/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.gui;

import java.awt.event.KeyEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.blocks.Shape;
import tetris.logic.Tetris;

/**
 *
 * @author Rubiini
 */
public class ListenerTest {
    private Listener listener;
    private Tetris tetris;
    private Shape shape;
    
    @Before
    public void setUp() {
        this.tetris = new Tetris(20, 10);
        this.listener = new Listener(null, tetris);
        this.shape = tetris.getShape();
    }
    
    
}
