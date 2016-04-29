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
    private Direction dir;
    
    @Before
    public void setUp() {
        creator = new ShapeCreator(0, 5);
        shape = creator.newShape();
        dir = Direction.RIGHT;
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
    public void getListWorks() {
        assertTrue(shape.getList() instanceof List);
    }

    
    /*@Test
    public void shapeCheckWorksCorrectlyI() {
        for (int i = 0; i < 4; i++) {
            int x = shape.getList().get(i).getX();
            int y = shape.getList().get(i).getY();
            shape.shapeCheck();
            if (i == 0 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(0).getX());
                assertTrue(y == shape.getList().get(0).getY() + 1);
            } else if (i == 1 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(1).getX() + 1);
                assertTrue(y == shape.getList().get(1).getY() + 1);
            } else if (i == 2 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(2).getX() + 2);
                assertTrue(y == shape.getList().get(2).getY() + 1);
            } else if (i == 3 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(3).getX() + 3);
                assertTrue(y == shape.getList().get(3).getY() + 1);
            }
            shape.shapeCheck();
            if (i == 0 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(0).getX() + 1);
                assertTrue(y == shape.getList().get(0).getY());
            } else if (i == 1 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(1).getX() + 1);
                assertTrue(y == shape.getList().get(1).getY() + 1);
            } else if (i == 2 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(2).getX() + 1);
                assertTrue(y == shape.getList().get(2).getY() + 2);
            } else if (i == 3 && shape.getNum() == 0) {
                assertTrue(x == shape.getList().get(3).getX() + 1);
                assertTrue(y == shape.getList().get(3).getY() + 3);
            }
        }
     }
    
    /*@Test
    public void rotateIWorksCorrectly() {
        for (int i = 0; i < 4; i++) {
            int x = shape.getList().get(i).getX();
            int y = shape.getList().get(i).getY();
            if (shape.getNum() == 0) {
                shape.rotateI();
                if (i == 0 && dir == Direction.RIGHT) {
                    assertEquals(x, shape.getList().get(0).getX());
                    assertEquals(y + 1, shape.getList().get(0).getY());
                } else if (i == 1) {
                    assertEquals(x + 1, shape.getList().get(1).getX());
                    assertEquals(y + 1, shape.getList().get(1).getY());
                } else if (i == 2) {
                    assertEquals(x + 2, shape.getList().get(2).getX());
                    assertEquals(y + 1, shape.getList().get(2).getY());
                } else {
                    assertEquals(x + 3, shape.getList().get(3).getX());
                    assertEquals(y + 1, shape.getList().get(3).getY());
                }
                shape.rotateI();
            }
            
        }
    }
    
    @Test
    public void rotateSWorksCorrectly() {
        for (int i = 0; i < 4; i++) {
            int x = shape.getList().get(i).getX();
            int y = shape.getList().get(i).getY();
            if (shape.getNum() == 2) {
                shape.rotateS();
                if (i == 0) {
                    assertEquals(x + 1, shape.getList().get(0).getX());
                    assertEquals(y, shape.getList().get(0).getY());
                } else if (i == 1) {
                    assertEquals(x + 1, shape.getList().get(1).getX());
                    assertEquals(y + 1, shape.getList().get(1).getY());
                } else if (i == 2) {
                    assertEquals(x + 2, shape.getList().get(2).getX());
                    assertEquals(y + 1, shape.getList().get(2).getY());
                } else {
                    assertEquals(x + 2, shape.getList().get(3).getX());
                    assertEquals(y + 2, shape.getList().get(3).getY());
                }
                shape.rotateS();
            }
            
        }
    }*/
    
    /*@Test
    public void rotateZWorksCorrectly() {
        for (int i = 0; i < 4; i++) {
            int x = shape.getList().get(i).getX();
            int y = shape.getList().get(i).getY();
            if (shape.getNum() == 3) {
                shape.rotateZ();
                if (i == 0) {
                    assertEquals(x + 1, shape.getList().get(0).getX());
                    assertEquals(y, shape.getList().get(0).getY());
                } else if (i == 1) {
                    assertEquals(x + 1, shape.getList().get(1).getX());
                    assertEquals(y + 1, shape.getList().get(1).getY());
                } else if (i == 2) {
                    assertEquals(x + 0, shape.getList().get(2).getX());
                    assertEquals(y + 1, shape.getList().get(2).getY());
                } else {
                    assertEquals(x + 0, shape.getList().get(3).getX());
                    assertEquals(y + 2, shape.getList().get(3).getY());
                }
                shape.rotateZ();
            }
            
        }
    }*/
}
