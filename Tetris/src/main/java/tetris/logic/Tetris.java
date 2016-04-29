package tetris.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;
import tetris.blocks.Block;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import tetris.gui.Update;

/**
 * Pelin logiikasta vastaava luokka.
 *
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
        super(500, null);
        this.width = width;
        this.height = height;
        this.creator = new ShapeCreator(1, width / 2 - 1);
        this.shape = creator.newShape();
        this.board = new Board(height, width);
        running = true;
        addActionListener(this);
        setInitialDelay(0);
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

    /**
     * Estää palikkaa liikkumasta vasemman seinän läpi.
     *
     * @return palauttaa true jos pala törmää vasempaan seinään
     */
    public boolean collissionWithLeftWall() {
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getX() < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Estää palikkaa liikkumasta oikean seinän läpi.
     *
     * @returnpalauttaa true jos pala törmää oikeaan seinään
     */
    public boolean collissionWithRightWall() {
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getX() > width - 1) {
                shape.moveLeft();
                return true;
            }
        }
        return false;
    }

    /**
     * Estää palikkaa liikkumasta lattian läpi. Estää myös
     * palikkaa liikkumasta muiden palojen läpi.
     *
     * @return palauttaa true jos pala törmää lattiaan tai muihin paloihin pelialustalla
     */
    public boolean collissionWithABlockOrFloor() {
        int[][] matrix = board.getBoardMatrix();
        for (int i = 0; i < 4; i++) {
            if (shape.getList().get(i).getY() > height) {
                this.moveUp();
                this.moveUp();
                board.addToBoardMatrix(shape);
                shape = creator.newShape();
                return true;
            }
            if (matrix[shape.getList().get(i).getY()][shape.getList().get(i).getX()] == 1) { //Jos ruudussa on jo pala
                this.moveUp();
                board.addToBoardMatrix(shape);
                shape = creator.newShape();
                return true;
            }
        }
        updateTetris();
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!running) {
            return;
        }
        moveDown();
        updateTetris();
    }

    /**
     * Kutsuu shapen metodia shapeCheck().
     */
    public void shapeCheckCall() {
        shape.shapeCheck();
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * Päivittää käyttöliittymän näkymän.
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
        updateTetris();
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveLeft() {
        if (!collissionWithLeftWall()) {
            shape.moveLeft();
            updateTetris();
        }
    }

    /**
     * Liikuttaa palikkaa alas.
     */
    public void moveRight() {
        shape.moveRight();
        collissionWithRightWall();
        updateTetris();
    }
}
