package geometria2;

/**
 *
 * @author aluno
 */
public class Paralelepipedo {
    private Retangulo xy;
    private Segmento lado3;

    public Paralelepipedo(double x, double y, double z) {
        /*Segmento X = new Segmento(x);
        Segmento Y = new Segmento(y);
        xy = new Retangulo(X, Y);
        */
        xy = new Retangulo(x, y);
        lado3 = new Segmento(z);
    }
    
    public Paralelepipedo(Retangulo xy, Segmento lado3) {
        this.xy = xy;
        this.lado3 = lado3;
    }
    
    public Retangulo getXy() {
        return xy;
    }

    public void setXy(Retangulo xy) {
        this.xy = xy;
    }

    public Segmento getLado3() {
        return lado3;
    }

    public void setLado3(Segmento lado3) {
        this.lado3 = lado3;
    }
    
    public double volume() {
        double z = xy.area();
        return z * lado3.getComp();
    }
    
}
