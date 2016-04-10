package tetris.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import tetris.blocks.Shape;

/**
 *
 * @author Rubiini
 */
public class Listener implements KeyListener {
    private Shape shape;

    public Listener(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            shape.moveUp();
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            shape.moveDown();
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            shape.moveLeft();
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            shape.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
}
