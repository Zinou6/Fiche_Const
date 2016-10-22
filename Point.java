//Ben Said   Zine El Abidine
package Shape;

/**
 *
 * @author Zinou
 */
public class Point {
   
    private float abscisse ;
    private float ordonnee ;
    
    public Point () {}
    
    public Point (float x)
    {
        this.abscisse = x;
        this.ordonnee = x; 
    }
    
    public Point (float x ,float y)
    {
        this.abscisse = x;
        this.ordonnee = y;
    }
    
    public float getAbscisse ()
    {
        return this.abscisse;
    }
    
    public float getOrdonne ()
    {
        return this.ordonnee;
    }
     
    public String Symetrie ()
    {
        return "("+(-this.abscisse)+ "," +this.ordonnee+ ")"; //incorrect 
    }
        public Point symetrie(){
        return new Point(-this.abscisse,this.ordonnee);
    }

    @Override
    public String toString ()  
    {
        return "("+this.abscisse+ "," +this.ordonnee+ ")";
    }
   
}
