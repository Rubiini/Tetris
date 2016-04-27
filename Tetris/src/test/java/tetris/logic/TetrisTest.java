/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.logic;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.blocks.Block;
import tetris.blocks.Board;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import tetris.gui.Panel;
import tetris.gui.Update;

/**
 *
 * @author samukaup
 */
public class TetrisTest {

    private Tetris tetris;
    private Shape shape;
    private ShapeCreator creator;
    private Board board;
    private int height;
    private int width;
    private Update update;

    @Before
    public void setUp() {
        this.height = 20;
        this.width = 10;
        this.tetris = new Tetris(height, width);
        this.creator = new ShapeCreator(0, 4);
        this.shape = creator.newShape();
        this.update = new Panel(tetris, height, width);
        tetris.setUpdate(update);
    }

    @Test
    public void getWidthWorks() {
        assertEquals(tetris.getWidth(), 10);
    }

    @Test
    public void getHeightWorks() {
        assertEquals(tetris.getHeight(), 20);
    }

    @Test
    public void getBoardWorks() {
        assertTrue(tetris.getBoard() instanceof Board);
    }

    @Test
    public void getShapeWorks() {
        assertTrue(tetris.getShape() instanceof Shape);
    }

    @Test
    public void isRunningWorks() {
        assertEquals(tetris.isRunning(), true);
    }

    @Test
    public void collisionWithRightWallWorksCorrectlyIfFalse() {
        assertEquals(tetris.collissionWithRightWall(), false);
    }

    @Test
    public void collisionWithLefttWallWorksCorrecltyIfFalse() {
        assertEquals(tetris.collissionWithLeftWall(), false);
    }

    @Test
    public void collisionWithABlockOrFloorWorksCorrecltyIfFalse() {
        assertEquals(tetris.collissionWithABlockOrFloor(), false);
    }

    @Test
    public void collisionWithLeftWallReturnTrueCorrectly() {
        shape = tetris.getShape();
        for (int i = 0; i < 10; i++) {
            shape.moveLeft();
        }
        assertEquals(tetris.collissionWithLeftWall(), true);
    }

    @Test
    public void collisionWithRightWallReturnTrueCorrectly() {
        shape = tetris.getShape();
        for (int i = 0; i < 10; i++) {
            shape.moveRight();
        }
        assertEquals(tetris.collissionWithRightWall(), true);
    }

    @Test
    public void collisionWithABlockOrFloorReturnTrueCorrectly() {
        shape = tetris.getShape();
        for (int i = 0; i < height; i++) {
            shape.moveDown();
        }
        assertEquals(tetris.collissionWithABlockOrFloor(), true);
    }

    @Test
    public void collisionWithLeftWallWorksIfCollisionOccur() {
        int x;
        shape = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            x = shape.getList().get(i).getX();
            if (tetris.collissionWithLeftWall()) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        assertEquals(shape.getList().get(j).getX(), x);
                    }
                }
            }
        }
    }

    @Test
    public void collisionWithRightWallWorksIfCollisionOccur() {
        int x;
        shape = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            x = shape.getList().get(i).getX();
            if (tetris.collissionWithRightWall()) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        assertEquals(shape.getList().get(j).getX(), x);
                    }
                }
            }
        }
    }

    @Test
    public void collisionWithABlockOrFloorWorksIfCollisionOccur() {
        int y;
        shape = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            y = shape.getList().get(i).getY();
            if (tetris.collissionWithRightWall()) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        assertEquals(shape.getList().get(j).getY(), y);
                    }
                }
            }
        }
    }

    @Test
    public void moveDownWorksCorrectly() {
        Shape s = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            int y = s.getList().get(i).getY();
            tetris.moveDown();
            shape = tetris.getShape();
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    assertEquals(y + 1, shape.getList().get(j).getY());
                }
            }
        }
    }

    @Test
    public void moveUpWorksCorrectly() {
        Shape s = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            int y = s.getList().get(i).getY();
            tetris.moveUp();
            shape = tetris.getShape();
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    assertEquals(y - 1, shape.getList().get(j).getY());
                }
            }
        }
    }

    @Test
    public void moveLeftWorksCorrectly() {
        Shape s = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            int x = s.getList().get(i).getX();
            tetris.moveLeft();
            shape = tetris.getShape();
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    assertEquals(x - 1, shape.getList().get(j).getX());
                }
            }
        }
    }

    @Test
    public void moveRightWorksCorrectly() {
        Shape s = tetris.getShape();
        for (int i = 0; i < 4; i++) {
            int x = s.getList().get(i).getX();
            tetris.moveRight();
            shape = tetris.getShape();
            for (int j = 0; j < 4; j++) {
                if (i == j && x < 8) {
                    assertEquals(x + 1, shape.getList().get(j).getX());
                }
            }
        }
    }
}
