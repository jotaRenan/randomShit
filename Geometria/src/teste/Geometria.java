package teste;

/**
 *
 * @author usuario
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paralelepipedo x = new Paralelepipedo(10, 15, 1);
        
        System.out.println(x.areaSup());
        System.out.println(x.volume());
    }
    
}
