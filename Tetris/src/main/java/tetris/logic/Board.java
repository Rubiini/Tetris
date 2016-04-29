package tetris.logic;

import tetris.blocks.Block;
import tetris.blocks.Shape;

/**
 * Pelialusta.
 *
 * @author samukaup
 */
public class Board {

    private int[][] boardMatrix;
    private int height;
    private int width;

    /**
     * Board asettaa paikallisille muuttujille konstruktorille annetut arvot.
     * @param y Koordinaatti korkeus-suunnassa
     * @param x Koordinaatti leveys-suunnassa
     */
    public Board(int y, int x) {
        this.height = y;
        this.width = x;
        this.boardMatrix = new int[y + 1][x + 1];
    }

    public int[][] getBoardMatrix() {
        return boardMatrix;
    }

    /**
     * Lisää palikan kaikki palat oikeaan kohtaan pelikentällä.
     *
     * @param shape Viimeisin pelikentällä pudonnut palikka.
     */
    public void addToBoardMatrix(Shape shape) {
        for (Block block : shape.getList()) {
            int curX = block.getX();
            int curY = block.getY();
            boardMatrix[curY][curX] = 1;
        }
        deleteFullRows();
    }

    /**
     * Poistaa täydet rivit pelikentältä.
     *
     * @return Palauttaa false jos mikään rivi pelikkentällä ei ole täysi
     */
    public boolean deleteFullRows() {
        for (int y = 0; y < height; y++) {
            int howMany = 0;
            for (int x = 0; x < width; x++) {
                if (boardMatrix[y][x] == 1) {
                    howMany++;
                }
                if (howMany == width) {
                    deleteRow(y);
                }
            }
        }
        return false;
    }

    /**
     * Poistaa yhden täyden rivin pelikentältä.
     * 
     * @param y kertoo poistettavan rivin koordinaatin
     */
    public void deleteRow(int y) {
        for (int x = 0; x < width; x++) {
            boardMatrix[y][x] = 0;
        }
        dropRow(y - 1);
    }

    /**
     * Pudottaa yllä olevat rivit alemmas poistettujen rivien tilalle.
     * 
     * @param y kertoo pudotettavan rivin koordinaatin
     */
    public void dropRow(int y) {
        for (int i = 0; i <= y; y--) {
            for (int x = 0; x < 10; x++) {
                if (boardMatrix[y][x] == 1) {
                    boardMatrix[y][x] = 0;
                    boardMatrix[y + 1][x] = 1;
                }
            }
        }
    }

    public int getCurY() {
        return height;
    }

    public int getCurX() {
        return width;
    }
}
