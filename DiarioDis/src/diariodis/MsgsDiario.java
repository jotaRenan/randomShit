/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodis;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Pedro Rosa
 */

public class MsgsDiario {
    
    public static String setNota() {
        return JOptionPane.showInputDialog("Insira nota do aluno: ");
    }
    
    public static String setFreq() {
        return JOptionPane.showInputDialog("Insira frequencia do aluno: ");
    }
    
    public static void getFreq(Diario alu) {
        JOptionPane.showMessageDialog(null, "Frequencia do aluno foi: " + alu.getFreq() + "/60.");
    }
    
    public static void getNota(Diario alu) {
        JOptionPane.showMessageDialog(null, "A nota do aluno foi: " + alu.getNota() + " de 10.");
    }
    
    public static void result(Diario alu) {
        String result;
        // -- Exibe string com status (aprovado/reprovado) e o conceito.
        result = ((alu.getResult() ? "Aprovado" : "Reprovado" ) + "\nConceito: " + alu.getConceito());
        JOptionPane.showMessageDialog(null, alu + result, result ,JOptionPane.PLAIN_MESSAGE);
    }
    
}
