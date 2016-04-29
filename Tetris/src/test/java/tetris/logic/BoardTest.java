/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.logic;

import java.util.ArrayList;
import java.util.List;
import tetris.logic.Board;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import static org.junit.Assert.*;
import tetris.blocks.Block;

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

    @Test
    public void deleteRowWorksCorrectly() {
        List<Block> list = new ArrayList<Block>();
        int[][] matrix = board.getBoardMatrix();
        for (int i = 0; i < 10; i++) {
            list.add(new Block(1, i));
        }
        Shape s = new Shape(0, 0, 0, list);
        board.addToBoardMatrix(s);
        board.deleteRow(1);
        matrix = board.getBoardMatrix();
        for (int i = 0; i < 10; i++) {
            assertEquals(matrix[1][i], 0);
        }
    }

    /*@Test
    public void dropRowWorksCorrectly() {
        List<Block> list = new ArrayList<Block>();
        List<Block> list2 = new ArrayList<Block>();
        int[][] matrix = board.getBoardMatrix();
        for (int i = 0; i < 10; i++) {
            list.add(new Block(1, i));
            if (i > 0) list2.add(new Block(0, i));
        }
        Shape s = new Shape(0, 0, 0, list);
        board.addToBoardMatrix(s);
        s = new Shape(0,0,0,list2);
        board.addToBoardMatrix(shape);
        board.deleteFullRows();
        matrix = board.getBoardMatrix();
        assertEquals(matrix[1][0], 0);
        for (int i = 1; i < 10; i++) {
            assertEquals(matrix[1][i], 1);
        }
    }*/

    @Test
    public void deleteFullRowWorksCorrectly() {
        List<Block> list = new ArrayList<Block>();
        int[][] matrix = board.getBoardMatrix();
        for (int i = 0; i < 10; i++) {
            list.add(new Block(1, i));
        }
        Shape s = new Shape(0, 0, 0, list);
        board.addToBoardMatrix(s);
        board.deleteFullRows();
        matrix = board.getBoardMatrix();
        for (int i = 0; i < 10; i++) {
            assertEquals(matrix[1][i], 0);
        }
    }

}
