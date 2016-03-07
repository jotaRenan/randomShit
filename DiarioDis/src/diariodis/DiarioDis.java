/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodis;
import java.util.Scanner;

/**
 *
 * @author Joao Pedro Rosa
 */
public class DiarioDis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Diario joaoP = new Diario(9, 45);
        Diario gb = new Diario();
        
        int x;
        double y;

        // -- Recebe valores e manda pra classe
        x = Integer.parseInt(MsgsDiario.setFreq());
        gb.setFreq(x);
        y = Double.parseDouble(MsgsDiario.setNota());
        gb.setNota(y);
        
        // -- Checa se objeto foi aprovado
        gb.isAproved();
        
        // -- Exibe mensagens
        MsgsDiario.result(gb);
        MsgsDiario.result(joaoP);
        
    }
    
}
