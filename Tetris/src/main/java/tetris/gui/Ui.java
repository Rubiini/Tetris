package tetris.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import tetris.blocks.Tetris;

/**
 *
 * @author Rubiini
 */
public class Ui implements Runnable {

    private JFrame frame;
    private Tetris tetris;
    private int height;
    private int width;
    private Panel panel;
    

    public Ui(Tetris tetris, int height, int width) {
        this.tetris = tetris;
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void run() {
         frame = new JFrame("Tetris");
         int x = (tetris.getWidth() + 1) * this.width + 200;
         int y = (tetris.getHeight() + 1) * this.height + 400;
         
         frame.setPreferredSize(new Dimension(x, y));
         
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         createComponents(frame.getContentPane());
         
         frame.pack();
         frame.setVisible(true);
    }
    
    public void createComponents(Container container) {
        panel = new Panel(tetris, height, width);
        container.add(panel);
        KeyListener listener = new Listener(tetris.getShape());
        frame.addKeyListener(listener);
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
    public Update getUpdate() {
        return panel;
    }
    
}
