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
        
        //--PetHouse com construtor nao tao gostosinho (tenho q mudar)
        PetHouse ferias = new PetHouse(persa, "CaeseGatos", 3);
        ferias.add(bulldog, "CaeseGatos", 5);
        //--Esses construtores estao zoados ai em cima.. fica pra dps   
        
        //--Mensagem show com JOptionPane
        MsgsPets.showEst(ferias);
        
        
    }
    
}
