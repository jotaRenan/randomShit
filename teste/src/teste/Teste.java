/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Voo[] voos = new Voo[5];

        for (int i=0; i< voos.length; i++) {
            int nVoo, tipo, preço;
            nVoo = Integer.parseInt(JOptionPane.showInputDialog("Insira numero do voo:"));
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Insira tipo de aviao:"));
            preço = Integer.parseInt(JOptionPane.showInputDialog("Insira preço da passagem:"));
            voos[i] = new Voo(nVoo, tipo, preço);
        }
        
        int rg, vooDes;
        do {
            rg = Integer.parseInt(JOptionPane.showInputDialog("Insira numero de RG:"));
            if (rg != 0) {
                vooDes = Integer.parseInt(JOptionPane.showInputDialog("Insira numero do voo desjeado:"));
                Passageiro pass = new Passageiro(rg, vooDes);
                int i;
                for (i=0; (i<voos.length) && (voos[i].getnVoo() != vooDes); i++) {}
                
                if (voos[i].isFull()) {
                    //System.out.println("Voo cheio.");
                    msgFinal(pass, voos[i]);
                }
                else {
                    //System.out.println("Adicionado");
                    msgFinal(pass, voos[i]);
                    voos[i].add();
                }
            }
        } while (rg != 0);
    }
    
    public static void msgFinal(Passageiro pass, Voo voo) {
        int icone;
        String title, msg;
        
        if (voo.isFull()) {
            title = "Impossivel confirmar compra.";
            msg = "\n\nVOO LOTADO";
            icone = JOptionPane.ERROR_MESSAGE;
        }
        else {
            title = "Compra confirmada";
            msg = "\n\nCOMPRA CONFIRMADA";
            icone = JOptionPane.INFORMATION_MESSAGE;
        }
        /*
        JFrame frame = new JFrame(title);
        frame.setLayout(new GridLayout(6, 15));
        frame.add(new JLabel(" " + voo.getnVoo()));
        frame.add(new JLabel(" " + voo.getPreço() + '\n'));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        */
        
        JOptionPane.showMessageDialog(null,
                "Voo numero: " + voo.getnVoo()
                + "\nModelo de aviao: " + voo.getTipo() 
                + "\nPreco de passagem: " + voo.getPreço() 
                + msg,
                title, icone );
    }
}
