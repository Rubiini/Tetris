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
    private Shape shape;
    
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
        List<Block> list1 = new ArrayList<>();
        Shape shape = creator.blockI();
        list1.add(new Block(0, 0));
        list1.add(new Block(0, 1));
        list1.add(new Block(0, 2));
        list1.add(new Block(0, 3));
        
        assertEquals(new Shape(list1), shape);
    }
}
