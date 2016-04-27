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
        creator = new ShapeCreator(20, 5);
        shape = creator.newShape();
        board = new Board(21, 10);
    }

    @Test
    public void addToBoardMatrixWorksCorrectly() {
        int[][] matrix2 = new int[21][10];
        board.addToBoardMatrix(shape);
        matrix2 = board.getBoardMatrix();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, matrix2[shape.getList().get(i).getY()][shape.getList().get(i).getX()]);
        }
    }
}
