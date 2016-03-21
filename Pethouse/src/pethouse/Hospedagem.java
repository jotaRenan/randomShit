/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pethouse;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Hospedagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro poodle = new Cachorro("Jorge", "Au", 0.1);
        Cachorro viraLata = new Cachorro("Bam-bam", "au", 0.3);
        Cachorro alemao = new Cachorro("Dara", "uiuiuiui", 0.8);

        Pethouse petshop = new Pethouse("Caes e cia", poodle, viraLata, alemao);
        DecimalFormat df = new DecimalFormat("#.###");        
        JOptionPane.showMessageDialog(null, "Ração restante em "+ petshop.getNome() + ": " + df.format(petshop.simularDias(3)) + "kg.");
        
        
    }
    
}
