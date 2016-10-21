//Ben Said   Zine El Abidine
package Shape;

/**
 *
 * @author Zinou
 */
public class Segment {
    
    private Point A ;
    private Point B ;
    
    public Segment (Point x)
    {
        this.A = x;
        this.B = new Point(); 
    }
    
    public Segment (Point x,Point y)
    {
        this.A = x;
        this.B = y;
    }
   
    public double Distance ()
    {
        return Math.sqrt((Math.pow((A.getAbscisse()-B.getAbscisse()), 2))+(Math.pow(A.getOrdonne()-B.getOrdonne(), 2)));
    }
    
    public String Symetrie ()
    {
        return A.Symetrie() + B.Symetrie();
    }
}
