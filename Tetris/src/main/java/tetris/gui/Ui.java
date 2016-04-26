package tetris.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import tetris.logic.Tetris;

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

    /**
     *
     * @param tetris
     * @param height
     * @param width
     */
    public Ui(Tetris tetris, int height, int width) {
        this.tetris = tetris;
        this.height = height;
        this.width = width;
    }

    @Override
    public void run() {
        this.frame = new JFrame("Tetris");
        int x = (tetris.getWidth()) * this.width + 10;
        int y = (tetris.getHeight() + 1) * this.height + 10;

        this.frame.setPreferredSize(new Dimension(x, y));

        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    /**
     *
     * @param container
     */
    public void createComponents(Container container) {
        panel = new Panel(tetris, height, width);
        container.add(panel);
        KeyListener listener = new Listener(tetris.getShape(), tetris);
        frame.addKeyListener(listener);
    }

    /**
     *
     * @return
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     *
     * @return
     */
    public Update getUpdate() {
        return panel;
    }

}
