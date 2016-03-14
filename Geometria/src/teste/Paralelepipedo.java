package teste;

/**
 *
 * @author Joao Pedro Rosa
 */
public class Paralelepipedo {
    private Segmento ladoZ;
    private Retangulo ret;
    
    public Paralelepipedo() {
        ret = new Retangulo();
        ladoZ = new Segmento();
    }
    
    public Paralelepipedo(double x, double y, double z) {
        ret = new Retangulo(x, y);
        ladoZ = new Segmento(z);
    }
    
    public Paralelepipedo(Segmento ladoZ, Retangulo ret) {
        this.ladoZ = ladoZ;
        this.ret = ret;
    }
        
    public double volume() {
        double xy = ret.area();
        double z = ladoZ.getSeg();
        return xy*z;
    }
    
    public double areaSup() {
        double x = ret.getLado1();
        double y = ret.getLado2();
        double z = ladoZ.getSeg();
        double area= 2* (x*y + x*z + y*z); //formula area superficial
        return area;
    }

    public double getLadoZ() {
        return ladoZ.getSeg();
    }

    public void setLadoZ(Segmento ladoZ) {
        this.ladoZ = ladoZ;
    }

    public Retangulo getRet() {
        return ret;
    }

    public void setRet(Retangulo ret) {
        this.ret = ret;
    }
 
}
