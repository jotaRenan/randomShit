/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria2;

/**
 *
 * @author aluno
 */
public class Segmento {
    private double comp;

    public Segmento(double comp) {
        this.comp = comp;
    }

    Segmento() {
        this.comp = 0;
    }
    
    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }
    
}
