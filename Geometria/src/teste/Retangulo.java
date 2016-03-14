/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria2;

/**
 *
 * @author aluno
 */
public class Retangulo {
    private Segmento lado1, lado2;

    public Retangulo() {
        lado1 = new Segmento();
        lado2 = new Segmento();
    }

    public Retangulo(double x, double y) {
        
        lado1 = new Segmento(x);
        lado2 = new Segmento(y);
    }
    
    public Retangulo(Segmento lado1, Segmento lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Segmento getLado1() {
        return lado1;
    }

    public void setLado1(Segmento lado1) {
        this.lado1 = lado1;
    }

    public Segmento getLado2() {
        return lado2;
    }

    public void setLado2(Segmento lado2) {
        this.lado2 = lado2;
    }
    
    public double area() {
        double x = lado1.getComp();
        double y = lado2.getComp();
        
        return x*y;
    }
    
    
}
