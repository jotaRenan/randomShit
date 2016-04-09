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
 * @author João Pedro
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
        
        /*
        JFrame frame = new JFrame("Grid Layout");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 10, 10));
        
        BotaoVoto botao1 = new BotaoVoto(candidatos[0]);
        BotaoVoto botao2 = new BotaoVoto(candidatos[1]);
        BotaoVoto botao3 = new BotaoVoto(candidatos[2]);
        BotaoVoto botao4 = new BotaoVoto(candidatos[3]);        
        JButton botao5 = new JButton("Nulo");
        //BotaoVoto botao6 = new BotaoVoto();
        
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(botao1);
        panel.add(botao2);
        panel.add(botao3);
        panel.add(botao4);
        panel.add(botao5);
        
       
        
        //panel.add(botao6);
        frame.add(panel);
        */
        
    }
    
}
