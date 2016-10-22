//Ben Said   Zine El Abidine
package Shape;

/**
 *
 * @author Zinou
 */
public class Cercle {
    
    private Point Centre ;
    private Segment Rayon;
    
    public Cercle (Point x)
    {
        this.Centre = new Point ();
        this.Rayon = new Segment (x);
    }
    
    public Cercle (Point P , Segment S) 
    {
        this.Centre = P;
        this.Rayon = S;
    }
    
    public double Perimetre ()
    {
        return Math.PI*(this.Rayon.Distance()*2);
    }
    
    public String Symetrie ()
    {
        return "Centre est :"+this.Centre.Symetrie() +" et le Rayon est :"+ this.Rayon.Symetrie(); // peut rester le meme
    }
    
       public Cercle symetrie() {
        return new Cercle(c.symetrie(), rayon);
    }
}
