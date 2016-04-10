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
        creator = new ShapeCreator();
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
        assertTrue(creator.blockI() instanceof Shape);
    }
    
    @Test
    public void blockOWorksCorrectly() {
        assertTrue(creator.blockO() instanceof Shape);
    }
    
    @Test
    public void blockSWorksCorrectly() {
        assertTrue(creator.blockS() instanceof Shape);
    }
    
    @Test
    public void blockZWorksCorrectly() {
        assertTrue(creator.blockZ() instanceof Shape);
    }
    
    @Test
    public void blockLWorksCorrectly() {
        assertTrue(creator.blockL() instanceof Shape);
    }
    
    @Test
    public void blockJWorksCorrectly() {
        assertTrue(creator.blockJ() instanceof Shape);
    }
    
    @Test
    public void blockTWorksCorrectly() {
        assertTrue(creator.blockT() instanceof Shape);
    }
}
