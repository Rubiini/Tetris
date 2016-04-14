package tetris.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;
import tetris.blocks.Block;
import tetris.blocks.Board;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import tetris.gui.Update;

/**
 *
 * @author Rubiini
 */
public class Tetris extends Timer implements ActionListener {

    private int width;
    private int height;
    private ShapeCreator creator;
    private Shape shape;
    private Board board;
    private boolean running;
    private Update update;

    /**
     *
     * @param width
     * @param height
     */
    public Tetris(int height, int width) {
        super(1000, null);
        this.width = width;
        this.height = height;
        this.creator = new ShapeCreator(0, width / 2 - 1);
        this.shape = creator.newShape();
        this.board = new Board(height, width);
        board.initializeBoardMatrix();
        running = true;

        addActionListener(this);
        setInitialDelay(100);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Board getBoard() {
        return board;
    }

    public Shape getShape() {
        return shape;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean collissionWithLeftWall() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (shape.getX() < 0) {
                    shape.moveRight();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean collissionWithRightWall() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (shape.getX() >= width) {
                    shape.moveLeft();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean collissionWithABlockOrFloor() {
        int[][] matrix = board.getBoardMatrix();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (shape.getY() >= height) {
                    shape.moveUp();
                    return true;
                }
            }
        }
        board.getBoardMatrix();
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!running) {
            return;
        }
        shape.moveDown();
        shape.moveLeft();
        shape.moveRight();
        shape.moveUp();
        updateTetris();
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public void updateTetris() {
        update.update();
    }
}
