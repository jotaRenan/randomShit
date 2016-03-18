/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pethouse;

/**
 *
 * @author usuario
 */
public class Cachorro {
    private String nome, som;
    private double qtdAl;
    private static double raçao = 10;
    
    public Cachorro(String nome, String som, double qtdAl) {
        //raçao = 10;
        this.nome = nome;
        this.som = som;
        this.qtdAl = qtdAl;
    }
    
    public void comer(){
        raçao -= this.qtdAl;
    }
    
    public static double getRaçao() {
        return raçao;
    }
    
}
