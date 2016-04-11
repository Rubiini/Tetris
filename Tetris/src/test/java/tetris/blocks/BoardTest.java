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
public class BoardTest {
    
    private Board board;
    private Shape shape;
    private ShapeCreator creator;
    
    @Before
    public void setUp() {
        creator = new ShapeCreator();
        shape = creator.newShape();
        board = new Board(20, 10);
    }
    
    @Test
    public void initializeBoardMatrixWorksCorrectly() {
        int[][] matrix;
        board.initializeBoardMatrix();
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                matrix = board.getBoardMatrix();
                assertEquals(0, matrix[y][x]);
            }
        }
    }
    
    @Test
    public void initializeBoardMatrixReturnCorrectly() {
        assertTrue(board.initializeBoardMatrix() instanceof int[][]);
    }
    
    /*@Test
    public void initializeBoardMatrixNegate() {
        if (board.getCurX() < 1 || board.getCurY() < 1) {
            assertEquals(creator, this);
        }
        board.initializeBoardMatrix();
        assertEquals(, );
    }
    /*@Test
    public void addToBoardMatrixWorksCorrectly() {
        int[][] matrix = new int[20][10];
        board.addToBoardMatrix(shape);
        board.getBoardMatrix();
    }*/
    
}
