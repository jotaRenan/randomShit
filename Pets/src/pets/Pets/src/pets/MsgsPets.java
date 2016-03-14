/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import javax.swing.JOptionPane;

public class MsgsPets {
    
    public static void showEst(PetHouse petHouse) {
        double totalGato = petHouse.estadiaCat * petHouse.getAlCat();
        double totalCao = petHouse.estadiaDog * petHouse.getAlDog();
        
        JOptionPane.showMessageDialog(null, "Animal: Gato\n"
                + petHouse.catToString() + "\nEstadia: " + petHouse.getEstadiaCat() 
                + "\nTotal comido: " + totalGato + "g"  
                + "\n\nAnimal: Cachorro\n" + petHouse.dogToString() 
                + "\nEstadia: " + petHouse.getEstadiaDog()
                + "\nTotal comido: " + totalCao,
                petHouse.getNome(), JOptionPane.PLAIN_MESSAGE); 
    }
    
}
