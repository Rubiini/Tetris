package tetris.blocks;

/**
 *
 * @author Rubiini
 */
public class Board {

    private int[][] boardMatrix;
    private int curY;
    private int curX;

    public Board(int y, int x) {
        this.curY = y;
        this.curX = x;
        this.boardMatrix = new int[y][x];
    }

    public int[][] initializeBoardMatrix() {
        int[][] matrix = new int[curY][curX];
        for (int y = 0; y < curY; y++) {
            for (int x = 0; x < curX; x++) {
                matrix[y][x] = 0;
            }
        }
        return matrix;
    }

    public int[][] getBoardMatrix() {
        return boardMatrix;
    }

    public void addToBoardMatrix(Shape shape) {
        for (Block block : shape.getList()) {
            int width = block.getX();
            int height = block.getY();
            boardMatrix[curY + height][curX + width] = 1;
        }
    }

    public int getCurY() {
        return curY;
    }

    public int getCurX() {
        return curX;
    }

    /*public boolean emptySlot() {

        return true;
    }*/

}