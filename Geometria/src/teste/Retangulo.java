package teste;

/**
 *
 * @author usuario
 */
public class Retangulo {
    private Segmento lado1, lado2;

    public Retangulo() {
        lado1 = new Segmento();
        lado2 = new Segmento();
    }
    
    public Retangulo(double lado1, double lado2) {
        this.lado1.setSeg(lado1);
        this.lado2.setSeg(lado2);
    }

    public Retangulo(Segmento lado1, Segmento lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double area(){
        return lado1.getSeg()*lado2.getSeg();
    }

    public double getLado1() {
        return lado1.getSeg();
    }

    public void setLado1(double lado1) {
        this.lado1.setSeg(lado1);
    }

    public double getLado2() {
        return lado2.getSeg();
    }

    public void setLado2(double lado2) {
        this.lado2.setSeg(lado2);
    }
}
