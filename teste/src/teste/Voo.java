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
public class Voo {

    private int nVoo, tipo, preço, capacidade, desocupados;
    
    public Voo(int nVoo, int tipo, int preço) {
        this.nVoo = nVoo;
        this.tipo = tipo;
        this.preço = preço;
        setCapacidade();
        this.desocupados = this.capacidade; 
    }
    
    private void setCapacidade() {
        switch(this.tipo) {
            case 707:
                this.capacidade = 10;
                break;
            case 737:
                this.capacidade = 5;
                break;
            case 727:
                this.capacidade = 7;
                break;
        }
    }
    
    public boolean isFull() {
        return this.desocupados == 0;
    }
    
    public void add() {
        desocupados--;
    }

    public int getnVoo() {
        return nVoo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        setCapacidade();
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getDesocupados() {
        return desocupados;
    }

    public void setDesocupados(int desocupados) {
        this.desocupados = desocupados;
    }

    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }
    
}
