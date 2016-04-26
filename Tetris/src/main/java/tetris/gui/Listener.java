package tetris.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import tetris.blocks.Shape;
import tetris.logic.Tetris;

/**
 * Kuuntelija.
 * @author Rubiini
 */
public class Listener implements KeyListener {
    private Shape shape;
    private Tetris tetris;
    
    /**
     * Näppäimistökuuntelija
     * @param shape
     * @param tetris
     */
    public Listener(Shape shape, Tetris tetris) {
        this.shape = shape;
        this.tetris = tetris;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            tetris.shapeCheckCall(); 
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            tetris.moveDown();
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            tetris.moveLeft();
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            tetris.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
}
