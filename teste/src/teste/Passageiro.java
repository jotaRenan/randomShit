/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Luciene
 */
public class Passageiro {
    private int rg, vooDes;

    public Passageiro(int rg, int vooDes) {
        this.rg = rg;
        this.vooDes = vooDes;
    }
    
    public Passageiro(Passageiro passageiro) {
        this.rg = passageiro.getRg();
        this.vooDes = passageiro.getVooDes();
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getVooDes() {
        return vooDes;
    }

    public void setVooDes(int vooDes) {
        this.vooDes = vooDes;
    }
        
    
}
