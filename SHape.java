//Ben Said   Zine El Abidine
package Shape;

/**
 *
 * @author Zinou
 */
public class SHape {

    
    public static void main(String[] args) {
       
        Point A = new Point ();
        Point B = new Point (5);
        Point C = new Point (3,8);
        
        System.out.println("Le point A mes coordonnées sont : "+A.toString());
        System.out.println("Le point B mes coordonnées sont : "+B.toString());
        System.out.println("Le point C mes coordonnées sont : "+C.toString());
        System.out.println("-----------------------------------");
        System.out.println("L'image de A est : A-1"+A.Symetrie());
        System.out.println("L'image de B est : B-1"+B.Symetrie());
        System.out.println("L'image de C est : C-1"+C.Symetrie());
        
        Segment S1 = new Segment (B);
        Segment S2 = new Segment (B,C);
        System.out.println("-----------------------------------");
        System.out.println("Le Segment AB = " +S1.Distance());
        System.out.println("Le Segment BC = " +S2.Distance());
        System.out.println("-----------------------------------");
        System.out.println("L'image de BC est CB "+S2.Symetrie());
        
        Cercle C1 = new Cercle (B);
        Cercle C2 = new Cercle (B,S2);
        System.out.println("-----------------------------------");
        System.out.println("Le Cercle C1: Centre O"+A.toString() +" et Rayon r = "+S1.Distance() +" Périmetre = "+C1.Perimetre() +" Son image C1-1 "+C1.Symetrie());
        System.out.println("Le Cercle C2: Centre B"+B.toString() +" et Rayon r = "+S2.Distance() +" Périmetre = "+C2.Perimetre() +" Son image C2-1 "+C2.Symetrie());
        
        
        
        
    }
    
}
