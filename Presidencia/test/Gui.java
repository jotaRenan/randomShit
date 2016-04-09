/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import presidencia.*;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class Gui extends JFrame{
    
    private JLabel titulo;
    private JButton b1, b2, b3, b4, b5, b6, bResult;
    private JPanel painel;
    private Candidatos[] candidatos;
    private Eleicao eleicao;
    
    public Gui(Eleicao eleicao) {
        
        super("Votacao");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        setLocationRelativeTo(null);
        
        this.candidatos = eleicao.getCandidatos();
        this.eleicao = eleicao;
        
        painel = new JPanel();
        painel.setLayout(new GridLayout(4, 3, 10, 10));
        
        titulo = new JLabel("Vote para PRESIDENTE");
        titulo.setFont( new Font( "ARIAL", Font.BOLD, 22));
        
        HandlerClass c1 = new HandlerClass(candidatos[0]);
        b1 = new JButton(candidatos[0].getNome());
        b1.addActionListener(c1);
        
        HandlerClass c2 = new HandlerClass(candidatos[1]);
        b2 = new JButton(candidatos[1].getNome());
        b2.addActionListener(c2);
        
        HandlerClass c3 = new HandlerClass(candidatos[2]);
        b3 = new JButton(candidatos[2].getNome());
        b3.addActionListener(c3);

        HandlerClass c4 = new HandlerClass(candidatos[3]);
        b4 = new JButton(candidatos[3].getNome());
        b4.addActionListener(c4);
        
        b5 = new JButton("Nulo");
        b6 = new JButton("Branco");
        
        Resultado eResult = new Resultado();
        bResult = new JButton("Resultado");
        bResult.addActionListener(eResult);
        
        painel.add(titulo);
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(bResult);
        
        add(painel);
        
        setVisible(true);
        
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
            // --fecha a janela
            dispose();
            
            eleicao.calcRes();
            JFrame frame = new JFrame("Resultado eleicoes presidenciais");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            
            JTextArea resultado = new JTextArea();
            resultado.setEditable(false);
            resultado.setSize(300, 300);
            if (eleicao.getVencedor() != null) {
                Candidatos vencedor = eleicao.getVencedor();
                resultado.append("Vencedor: " + vencedor.getNome());
                resultado.append("\nNmr de votos: " + vencedor.getVotos());
            }
            else {
                resultado.append("Havera segundo ");
            }
            
            frame.add(resultado);
            frame.setVisible(true);
            
        }
    }
    
}
