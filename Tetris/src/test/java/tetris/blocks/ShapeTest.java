/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.blocks;

import java.util.ArrayList;
import java.util.List;
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
public class ShapeTest {
    private Shape shape;
    private ShapeCreator creator;
    
    @Before
    public void setUp() {
        creator = new ShapeCreator();
        shape = creator.newShape();
    }
    
    @Test
    public void moveUpWorksCorrectly() {
        for (Block block : shape.getList()) {
            int number = block.getY();
            shape.moveUp();
            assertEquals(block.getY(), number - 1);
        }
    }
    
    @Test
    public void moveDownWorksCorrectly() {
        for (Block block : shape.getList()) {
            int number = block.getY();
            shape.moveDown();
            assertEquals(block.getY(), number + 1);
        }
    }
    
    @Test
    public void moveLeftWorksCorrectly() {
        for (Block block : shape.getList()) {
            int number = block.getX();
            shape.moveLeft();
            assertEquals(block.getX(), number - 1);
        }
    }
    
    @Test
    public void moveRightWorksCorrectly() {
        for (Block block : shape.getList()) {
            int number = block.getX();
            shape.moveRight();
            assertEquals(block.getX(), number + 1);
        }
    }
    
    @Test
    public void setListWorkCorrectly() {
        List<Block> list = new ArrayList<Block>();
        list.add(new Block(0, 1));
        list.add(new Block(0, 2));
        list.add(new Block(0, 3));
        list.add(new Block(0, 4));
        shape.setList(list);
        assertEquals(shape.getList(), list);
    }
    
    @Test
    public void rotateWorksCorrectly() {
        
    }
}
