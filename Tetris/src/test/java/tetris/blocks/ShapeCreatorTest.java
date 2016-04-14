package tetris.blocks;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rubiini
 */
public class ShapeCreatorTest {
    
    private ShapeCreator creator;
    
    @Before
    public void setUp() {
        creator = new ShapeCreator(10, 5);
    }
    
    @Test
    public void newShapeWorksCorrectly() {
        assertTrue(creator.newShape() instanceof Shape);
    }
    
    @Test
    public void createNewListWorksCorrectly() {
        List<Block> list = new ArrayList<>();
        assertEquals(list, creator.createNewList());
    }
    
    @Test
    public void blockIWorksCorrectly() {
        assertTrue(creator.blockI(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockOWorksCorrectly() {
        assertTrue(creator.blockO(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockSWorksCorrectly() {
        assertTrue(creator.blockS(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockZWorksCorrectly() {
        assertTrue(creator.blockZ(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockLWorksCorrectly() {
        assertTrue(creator.blockL(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockJWorksCorrectly() {
        assertTrue(creator.blockJ(20, 5) instanceof Shape);
    }
    
    @Test
    public void blockTWorksCorrectly() {
        assertTrue(creator.blockT(20, 5) instanceof Shape);
    }
}
