/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author usuario
 */
public class BotaoVoto extends JButton {
    
    public BotaoVoto(Candidatos candidato){
        super(candidato.getNome());
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                candidato.vote();
                System.out.println("Voce votou no candidato " + candidato.getNome());
            }
        });
    }
    
  
    
}
