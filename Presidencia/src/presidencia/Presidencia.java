/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidencia;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JOAO PEDRO RENAN UHULL
 */
public class Presidencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Candidatos[] candidatos = new Candidatos[4];
        String[] nomes = {"Lulalele", "Cirogrude", "Criancinha", "Roseacai"};
        
        for (int i =0; i < candidatos.length; i++) {
            candidatos[i] = new Candidatos(nomes[i]);
        }
        
        Eleicao presidencial = new Eleicao(candidatos);
        
    }
    
}
