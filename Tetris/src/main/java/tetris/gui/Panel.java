package tetris.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import tetris.blocks.Block;
import tetris.blocks.Board;
import tetris.blocks.Shape;
import tetris.blocks.Tetris;

/**
 *
 * @author Rubiini
 */
public class Panel extends JPanel implements Update{

    private Tetris tetris;
    private int widthSize;
    private int heightSize;

    public Panel(Tetris tetris, int widthSize, int heightSize) {
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
        
        g.setColor(Color.BLACK);
        for (Block block : shape) {
            g.fill3DRect(block.getX() * widthSize, block.getY() * heightSize, widthSize, heightSize, true);
        }
        for (int i = 0; i < heightSize; i++) {
            for (int j = 0; j < widthSize; j++) {
                if (matrix[i][j] == 0) {
                    
                } else {
                    
                }
            }
        }
    }
    
    @Override
    public void update() {
        super.repaint();
    }
    
}
