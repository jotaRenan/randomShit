/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author usuario
 */
public class Gato {
    private String nome, som;
    double qtdAl;

    public Gato() {
    }

    public Gato(String nome, String som, double qtdAl) {
        this.nome = nome;
        this.som = som;
        this.qtdAl = qtdAl;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public double getQtdAl() {
        return qtdAl;
    }

    public void setQtdAl(double qtdAl) {
        this.qtdAl = qtdAl;
    }    
    
    public String toString() {
        return ("Nome: " + nome + "\nSom: " + som + "\nQtd. de Alimento: " + qtdAl);
    }
    
}
