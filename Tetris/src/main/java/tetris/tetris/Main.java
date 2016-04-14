package tetris.tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import tetris.blocks.Block;
import tetris.blocks.Shape;
import tetris.blocks.ShapeCreator;
import tetris.blocks.Tetris;
import tetris.gui.Ui;
import tetris.logiikka.Logiikka;
import tetris.logiikka.PalikanArpoja;
import tetris.palat.IPala;
import tetris.palat.Pelialusta;
import tetris.palat.Palikka;
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

        Ui ui = new Ui(tetris, 10, 10);
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
        /*Scanner lukija = new Scanner(System.in);

        Pelialusta alusta = new Pelialusta(18, 1);
        Logiikka logic = new Logiikka(alusta);
        if (logic.lisataankoPalaPelialustaan()) {
            for (int y = 0; y < 21; y++) {
                for (int x = 0; x < 12; x++) {
                    if (alusta.getKoordinaatti(y, x) == 0) {
                        System.out.print("0 ");
                    }
                    if (alusta.getKoordinaatti(y, x) == 1) {
                        System.out.print("1 ");
                    }
                    if (alusta.getKoordinaatti(y, x) > 1 && alusta.getKoordinaatti(y, x) != 9) {
                        System.out.print("x ");
                    }
                    if (alusta.getKoordinaatti(y, x) == 9) {
                        System.out.print("9 ");
                    }
                }
                System.out.println("");
            }
        } else {
            logic.lisaaPalaPelialustaan();
            for (int y = 0; y < 21; y++) {
                for (int x = 0; x < 12; x++) {
                    if (alusta.getKoordinaatti(y, x) == 0) {
                        System.out.print("0 ");
                    }
                    if (alusta.getKoordinaatti(y, x) == 1) {
                        System.out.print("1 ");
                    }
                    if (alusta.getKoordinaatti(y, x) > 1 && alusta.getKoordinaatti(y, x) != 9) {
                        System.out.print("x ");
                    }
                    if (alusta.getKoordinaatti(y, x) == 9) {
                        System.out.print("9 ");
                    }
                }
                System.out.println("");
            }
        }

        /*while (true) {
         System.out.println("liikuta A, S, D ja W näppäimillä");
         String luku = lukija.nextLine();
         if (luku == "a") {
         alusta.liikuVasemmalle();
         } else if (luku == "d") {
         alusta.liikuOikealle();
         } else if (luku == "s") {
         alusta.liikuAlas();
         } else {
         alusta.liikuYlos();
         }
         logic.lisataankoPalaPelialustaan();

         }
         */
    }

}
