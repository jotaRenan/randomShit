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

import javax.swing.JOptionPane;
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
        Gato persa = new Gato("Satanzinho", "Miau", 300);
        
        //--PetHouse com construtor gostosinho
        PetHouse ferias = new PetHouse(bulldog, 5, persa, 3, "CaeseGatos");
        
        //--Mensagem show com JOptionPane
        MsgsPets.showEst(ferias);
        
        Gato deDeus = new Gato("Mingau", "miau", 300);
        //--Mudando o gato q ta de ferias
        ferias.setCat(deDeus);
        
        bulldog.setNome(JOptionPane.showInputDialog("Insira nome do cachorro: "));
        bulldog.setSom(JOptionPane.showInputDialog("Insira som do cachorro: "));
        bulldog.setQtdAl(Double.parseDouble(JOptionPane.showInputDialog("Insira"
                + " qtd de alimento do cachorro: ")));
        
        //--Mensagem show com JOptionPane
        MsgsPets.showEst(ferias);
    }
    
}
