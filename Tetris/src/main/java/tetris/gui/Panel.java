package tetris.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import tetris.blocks.Block;
import tetris.logic.Board;
import tetris.blocks.Shape;
import tetris.logic.Tetris;

/**
 * Paneeli luokka, joka piirtää pelin komponentit.
 *
 * @author Rubiini
 */
public class Panel extends JPanel implements Update {

    private Tetris tetris;
    private int widthSize;
    private int heightSize;

    /**
     * Panel asettaa paikallisille muuttujille konstruktorille annetut arvot.
     * @param tetris Tetris pelin logiikka
     * @param heightSize Koko pysty-suunnassa
     * @param widthSize Koko vaaka-suunnassa
     */
    public Panel(Tetris tetris, int heightSize, int widthSize) {
        this.tetris = tetris;
        this.widthSize = widthSize;
        this.heightSize = heightSize;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        
        paintShape(g);
        paintBoard(g);
        paintScore(g);
    }
    
    /**
     * Piirtää liikutettavan palan.
     * @param g 
     */
    public void paintShape(Graphics g) {
        List<Block> shape = tetris.getShape().getList();
        for (Block block : shape) {
            g.fill3DRect(block.getX() * widthSize, block.getY() * heightSize, widthSize, heightSize, true);
        }
    }
    
    /**
     * Piirtää pelialustalla olevat palat.
     * @param g 
     */
    public void paintBoard(Graphics g) {
        int[][] matrix = tetris.getBoard().getBoardMatrix();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] == 1) {
                    g.fill3DRect(j * widthSize, i * heightSize, widthSize, heightSize, true);
                } 
            }
        }
    }
    /**
     * Piirtää pistenäkymän.
     * @param g 
     */
    public void paintScore(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString("Score: " + tetris.getScore(), 
                tetris.getHeight() - g.getFontMetrics().stringWidth("Score: " + tetris.getScore()) + 270, 
                g.getFontMetrics().getHeight());
    }
    /**
     * Päivittää käyttöliittymän näkymän, eli maalaa palat uudestaan.
     */
    
    @Override
    public void update() {
        super.repaint();
    }

}
