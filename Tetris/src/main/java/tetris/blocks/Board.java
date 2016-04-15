package tetris.blocks;

/**
 * Pelialusta.
 * @author samukaup
 */
public class Board {

    private int[][] boardMatrix;
    private int curY;
    private int curX;

    /**
     *
     * @param y
     * @param x
     */
    public Board(int y, int x) {
        this.curY = y;
        this.curX = x;
        this.boardMatrix = new int[y][x];
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
     * @param shape
     */
    public void addToBoardMatrix(Shape shape) {
        for (Block block : shape.getList()) {
            int width = block.getX();
            int height = block.getY();
            boardMatrix[curY + height][curX + width] = 1;
        }
    }

    /**
     *
     * @return
     */
    public int getCurY() {
        return curY;
    }

    /**
     *
     * @return
     */
    public int getCurX() {
        return curX;
    }

    /*public boolean emptySlot() {

     return true;
     }*/
    
    /*public int[][] initializeBoardMatrix() {
     int[][] matrix = new int[curY][curX];
     for (int y = 0; y < curY; y++) {
     for (int x = 0; x < curX; x++) {
     matrix[y][x] = 0;
     }
     }
     return matrix;
     }*/
}
