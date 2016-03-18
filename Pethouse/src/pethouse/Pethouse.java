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
public class Pethouse {
    
    String nome;   
    Cachorro poodle, viraLata, alemao;

    public Pethouse(String nome, Cachorro poodle, Cachorro viraLata, 
            Cachorro alemao) {
        
        this.nome = nome;
        this.alemao = alemao;
        this.poodle = poodle;
        this.viraLata = viraLata;

    }
    
    public double simularDias(int dias) {
        
        for (int i=0; i<dias; i++) {
            poodle.comer();
            viraLata.comer();
            alemao.comer();
        }

        return Cachorro.getRaçao();
        
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
