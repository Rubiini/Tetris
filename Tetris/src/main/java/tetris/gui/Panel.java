package tetris.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import tetris.blocks.Block;
import tetris.logic.Board;
import tetris.blocks.Shape;
import tetris.logic.Tetris;

/**
 * Paneeli.
 *
 * @author Rubiini
 */
public class Panel extends JPanel implements Update {

    private Tetris tetris;
    private int widthSize;
    private int heightSize;

    /**
     *
     * @param tetris
     * @param heightSize
     * @param widthSize
     */
    public Panel(Tetris tetris, int heightSize, int widthSize) {
        this.tetris = tetris;
        this.widthSize = widthSize;
        this.heightSize = heightSize;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Board board = tetris.getBoard();
        int[][] matrix = board.getBoardMatrix();
        List<Block> shape = tetris.getShape().getList();
        Random random = new Random();
        
        g.setColor(Color.BLACK);

        for (Block block : shape) {
            g.fill3DRect(block.getX() * widthSize, block.getY() * heightSize, widthSize, heightSize, true);
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] == 1) {
                    g.fill3DRect(j * widthSize, i * heightSize, widthSize, heightSize, true);
                } 
            }
        }
    }

    /**
     *
     */
    @Override
    public void update() {
        super.repaint();
    }

}
