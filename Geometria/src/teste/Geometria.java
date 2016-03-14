/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria2;

/**
 *
 * @author aluno
 */
public class Geometria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //--Segmento com construtor double
        Segmento seg = new Segmento(3.0);
        
        //--Retangulo com parametros double
        Retangulo xy = new Retangulo(3, 4);
        //--Retangulo com parametros Segmento
        Retangulo ret = new Retangulo(seg, seg);
        
        //--Paralelepipedo com parametros double
        Paralelepipedo x = new Paralelepipedo(3.0, 3.0, 3.0);
        //-Paralelepipedo com parametros Retangulo e Segmento
        Paralelepipedo y = new Paralelepipedo(xy, seg);
        
        System.out.println(ret.area());
        
    }
}
