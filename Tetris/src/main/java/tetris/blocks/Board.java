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
     *
     * @param shape
     */
    public void addToBoardMatrix(Shape shape) {
        for (Block block : shape.getList()) {
            int curX = block.getX();
            int curY = block.getY();
            boardMatrix[this.height + curY][this.width + curX] = 1;
        }
    }
    
    /**
     * 
     * @return 
     */
    public boolean deleteFullRows() {
        for (int y = 0; y < height; y++) {
            int howMany = 1;
            for (int x = 0; x < width; x++) {
                if (boardMatrix[y][x] == 1) {
                    howMany++;
                }
                if (howMany == width) {
                    deleteRow(y);
                }
                boardMatrix[y][x] = 0;
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
