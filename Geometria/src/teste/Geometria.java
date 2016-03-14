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
        
        Segmento test = new Segmento(3);
        Segmento test2 = new Segmento(4);
        
        Retangulo ret = new Retangulo(test, test2);
        //System.out.println(ret.area());
        
        Paralelepipedo x = new Paralelepipedo(test2, ret);
        
        
        x.setLadoZ(test);
        x.setRet(ret);
        
        System.out.println(x.getLadoZ());
        System.out.println(x.getRet().area());
        System.out.println(x.areaSup());
        System.out.println(x.volume());
    }    
}
