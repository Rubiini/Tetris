package tetris.tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import tetris.blocks.Block;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import tetris.logic.Tetris;
import tetris.gui.Ui;
import tetris.gui.Update;

/**
 *
 * @author samukaup
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tetris tetris = new Tetris(20, 10);

        Ui ui = new Ui(tetris, 30, 30);
        SwingUtilities.invokeLater(ui);

        while (ui.getUpdate() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Piirtoalustaa ei ole vielä luotu.");
            }
        }

        tetris.setUpdate(ui.getUpdate());
        tetris.start();
        /*ShapeCreator creator = new ShapeCreator();
        Shape shape = new Shape(null);
        shape = creator.newShape();
        /*Shape shape = new Shape();
        List<Block> list = new ArrayList<Block>();
        list = shape.newBlock();
        for (Block lista : list) {
            System.out.print(lista.getX());
            System.out.print(lista.getY());
            System.out.println("");
        }
        */

        
    }

}
