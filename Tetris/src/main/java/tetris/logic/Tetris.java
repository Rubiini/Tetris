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
 * Pelin logiikasta vastaava luokka.
 * @author samukaup
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
     * @param height
     * @param width
     */
    public Tetris(int height, int width) {
        super(1000, null);
        this.width = width;
        this.height = height;
        this.creator = new ShapeCreator(0, width / 2 - 1);
        this.shape = creator.newShape();
        this.board = new Board(height, width);
        //board.initializeBoardMatrix();
        running = true;

        addActionListener(this);
        setInitialDelay(0);
    }

    /**
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    public Board getBoard() {
        return board;
    }

    /**
     *
     * @return
     */
    public Shape getShape() {
        return shape;
    }

    public boolean isRunning() {
        return running;
    }

    /**
     * Estää palikkaa liikkumasta vasemman seinän läpi.
     * @return
     */
    public boolean collissionWithLeftWall() {
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getX() < -1) {
                this.moveRight();
                return true;
            }
        }
        return false;
    }

    /**
     * Estää palikkaa liikkumasta oikean seinän läpi.
     * @return
     */
    public boolean collissionWithRightWall() {
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getX() > width) {
                this.moveLeft();
                return true;
            }
        }
        return false;
    }

    /**
     * Estää palikkaa liikkumasta lattian läpi.
     * Tulevaisuudessa estää myös palikkaa liikkumasta muiden palojen läpi.
     * @return
     */
    public boolean collissionWithABlockOrFloor() {
        int[][] matrix = board.getBoardMatrix();
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getY() > height - 1) {
                this.moveUp();
                //board.addToBoardMatrix(shape);
                return true;
            }
            /*if (matrix[shape.getList().get(i).getY()][shape.getList().get(i).getX()] == 1) { //Jos ruudussa on jo pala
                this.moveUp();
                board.addToBoardMatrix(shape);
            }*/
        }
        return false;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!running) {
            return;
        }
        moveDown();
        moveLeft();
        moveRight();
        moveUp();
        updateTetris();
    }

    /**
     *
     * @param update
     */
    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     *
     */
    public void updateTetris() {
        update.update();
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveDown() {
        shape.moveDown();
        collissionWithABlockOrFloor();
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveUp() {
        shape.moveUp();
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveLeft() {
        shape.moveLeft();
        collissionWithLeftWall();
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveRight() {
        shape.moveRight();
        collissionWithRightWall();
    }
}
