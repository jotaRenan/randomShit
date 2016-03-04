/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodis;

/**
 *
 * @author Joao Pedro Rosa
 */

public class MsgsDiario {
    
    public static void setNota() {
        System.out.println("Insira nota do aluno: ");
    }
    
    public static void setFreq() {
        System.out.println("Insira frequencia do aluno: ");
    }
    
    public static void getFreq(Diario alu) {
        System.out.println("Frequencia do aluno foi: " + alu.getFreq() + "/60.");
    }
    
    public static void getNota(Diario alu) {
        System.out.println("A nota do aluno foi: " + alu.getNota() + " de 10.");
    }
    
}
