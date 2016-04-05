package tetris.palat;

/**
 *
 * @author samukaup
 */
public interface Palat {
    
    public void kaanna();
    
    public int[][] getPalikka();
    
    public int getX();
    
    public int getY();
    
    public int liikuAlas();
    
    public int liikuYlos();
    
    public int liikuOikealle();
    
    public int liikuVasemmalle();
}
