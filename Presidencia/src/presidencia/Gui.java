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
 * @author usuario
 */
public class Gui extends JFrame{
    
    private JButton b1, b2, b3, b4, b5, b6;
    private JPanel painel;
    private Candidatos[] candidatos;
    private Eleicao eleicao;
    
    public Gui(Eleicao eleicao) {
        
        super("Votacao");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        
        this.candidatos = eleicao.getCandidatos();
        this.eleicao = eleicao;
        
        painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 10, 10));
        
        HandlerClass c1 = new HandlerClass(candidatos[0]);
        b1 = new JButton(candidatos[0].getNome());
        b1.addActionListener(c1);
        
        HandlerClass c2 = new HandlerClass(candidatos[1]);
        b2 = new JButton(candidatos[1].getNome());
        b2.addActionListener(c2);
        
        HandlerClass c3 = new HandlerClass(candidatos[2]);
        b3 = new JButton(candidatos[2].getNome());
        b3.addActionListener(c3);

        Resultado c4 = new Resultado();
        b4 = new JButton("Resultado");
        b4.addActionListener(c4);
        
        HandlerClass c5 = new HandlerClass(candidatos[3]);
        b5 = new JButton(candidatos[3].getNome());
        b5.addActionListener(c5);
        
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(b4);
        painel.add(b5);
        add(painel);
        
    }
    
    private class HandlerClass implements ActionListener{
        
        private Candidatos candidato;        

        public HandlerClass(Candidatos candidato) {
            this.candidato = candidato;
        }
        
        public void actionPerformed(ActionEvent event) {
            candidato.vote();
            System.out.println("Voce votou em: " + candidato.getNome());
            System.out.println("Votos do candidato: " + candidato.getVotos());
        }
    }
    
    private class Resultado implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            eleicao.calcRes();
            Candidatos vencedor = eleicao.getVencedor();
            System.out.println("Vencedor: " + vencedor.getNome());
            System.out.println("Nmr de votos: " + vencedor.getVotos());
        }
    }
    
}
