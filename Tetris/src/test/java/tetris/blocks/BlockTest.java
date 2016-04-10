/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rubiini
 */
public class BlockTest {
    private Block block;
    
    @Before
    public void setUp() {
        block = new Block(1, 1);
    }
    
    @Test
    public void moveUpWorksCorrectly() {
        block.moveUp();
        assertEquals(block.getY(), 0);
    }
    
    @Test
    public void moveDownWorksCorrectly() {
        block.moveDown();
        assertEquals(block.getY(), 2);
    }
    
    @Test
    public void moveLeftWorksCorrectly() {
        block.moveLeft();
        assertEquals(block.getX(), 0);
    }
    
    @Test
    public void moveRightWorksCorrectly() {
        block.moveRight();
        assertEquals(block.getX(), 2);
    }
}
