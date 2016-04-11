package tetris.blocks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
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
    public Tetris(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.creator = new ShapeCreator();
        this.shape = creator.newShape();
        this.board = new Board(height, width);
        board.initializeBoardMatrix();

        addActionListener(this);
        setInitialDelay(2000);
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

    private boolean collissionWithLeftWall() {
        return false;
    }

    private boolean collissionWithRightWall() {
        return false;
    }

    private boolean collissionWithABlockOrFloor() {

        board.getBoardMatrix();
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!running) {
            return;
        }

    }

    public void setUpdate(Update update) {
        this.update = update;
    }

}
