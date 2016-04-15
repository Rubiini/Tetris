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
        assertTrue(creator.blockI(0, 5) instanceof Shape);
    }
            
    @Test
    public void blockOWorksCorrectly() {
        assertTrue(creator.blockO(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockSWorksCorrectly() {
        assertTrue(creator.blockS(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockZWorksCorrectly() {
        assertTrue(creator.blockZ(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockLWorksCorrectly() {
        assertTrue(creator.blockL(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockJWorksCorrectly() {
        assertTrue(creator.blockJ(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockTWorksCorrectly() {
        assertTrue(creator.blockT(0, 5) instanceof Shape);
    }
    
    @Test
    public void blockIJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockI(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(2 ,shape.getList().get(2).getX());
        assertEquals(3 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(0 ,shape.getList().get(2).getY());
        assertEquals(0 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockOJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockO(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(0 ,shape.getList().get(2).getX());
        assertEquals(1 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(1 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockSJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockS(0, 0);
        assertEquals(2 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(0 ,shape.getList().get(2).getX());
        assertEquals(1 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(1 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockZJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockZ(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(1 ,shape.getList().get(2).getX());
        assertEquals(2 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(1 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockLJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockL(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(2 ,shape.getList().get(2).getX());
        assertEquals(0 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(0 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockJJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockJ(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(2 ,shape.getList().get(2).getX());
        assertEquals(2 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(0 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
    
    @Test
    public void blockTJustToKillTheMutantsFromSubstraction() {
        Shape shape = creator.blockT(0, 0);
        assertEquals(0 ,shape.getList().get(0).getX());
        assertEquals(1 ,shape.getList().get(1).getX());
        assertEquals(2 ,shape.getList().get(2).getX());
        assertEquals(1 ,shape.getList().get(3).getX());
        
        assertEquals(0 ,shape.getList().get(0).getY());
        assertEquals(0 ,shape.getList().get(1).getY());
        assertEquals(0 ,shape.getList().get(2).getY());
        assertEquals(1 ,shape.getList().get(3).getY());
    }
}
