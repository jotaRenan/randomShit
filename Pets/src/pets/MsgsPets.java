/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import javax.swing.JOptionPane;

public class MsgsPets {
    
    public static void showEst(PetHouse petHouse) {
        JOptionPane.showMessageDialog(null, "Animal: Gato\n" + 
                petHouse.cat.toString() 
                + "\n\nAnimal: Cachorro\n" + petHouse.dog.toString() 
                + "\n\nEstadia: " + petHouse.getEstadia(),
                petHouse.getNome(), JOptionPane.PLAIN_MESSAGE); 
    }
    
}
