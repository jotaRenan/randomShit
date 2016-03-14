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
public class Pets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //--Cachorro com construtor vazio
        Cachorro bulldog = new Cachorro();
        
        //--Definindo atributos do objeto
        bulldog.setNome("Robertinho");
        bulldog.setSom("Au au aauauauauau!");
        bulldog.setQtdAl(450);
        
        //--Gato com construtor gostosinho e cheio
        Gato persa = new Gato("Satanzinho", "Miau666", 300);
        
        //--PetHouse com construtor gostosinho
        PetHouse ferias = new PetHouse(bulldog, persa, "CaeseGatos", 5);
        
        //--Mensagem show com JOptionPane
        MsgsPets.showEst(ferias);
        
        Gato deDeus = new Gato("Mingau", "miau", 300);
        //--Mudando o gato q ta de ferias
        ferias.setCat(deDeus);
        
        //--Mensagem show com JOptionPane
        MsgsPets.showEst(ferias);
    }
    
}
