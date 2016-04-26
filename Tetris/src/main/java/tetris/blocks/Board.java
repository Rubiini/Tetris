package tetris.blocks;

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
     *
     * @param y
     * @param x
     */
    public Board(int y, int x) {
        this.height = y;
        this.width = x;
        this.boardMatrix = new int[y + 1][x + 1];
    }

    /**
     *
     * @return
     */
    public int[][] getBoardMatrix() {
        return boardMatrix;
    }

    /**
     * Lisää palikan kaikki palat taulukkoon.
     *
     * @param shape
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
     * Poistaa täyden rivin.
     *
     * @return
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
     *
     * @param y
     */
    public void deleteRow(int y) {
        for (int x = 0; x < width; x++) {
            boardMatrix[y][x] = 0;
        }
        dropRow(y - 1);
    }

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

    /**
     *
     * @return
     */
    public int getCurY() {
        return height;
    }

    /**
     *
     * @return
     */
    public int getCurX() {
        return width;
    }
}
