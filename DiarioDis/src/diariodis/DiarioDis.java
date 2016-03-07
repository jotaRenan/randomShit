/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodis;
import java.util.Scanner;
import javax.swing.JOptionPane;

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

        x = Integer.parseInt(MsgsDiario.setFreq());
        gb.setFreq(x);
        
        y = Double.parseDouble(MsgsDiario.setNota());
        gb.setNota(y);

        MsgsDiario.result(gb);
        MsgsDiario.result(joaoP);
    }
    
}
