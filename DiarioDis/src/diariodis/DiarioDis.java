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
        
        MsgsDiario.setFreq();
        x = Integer.parseInt(scanner.nextLine());
        gb.setFreq(x);
        MsgsDiario.setNota();
        y = Double.parseDouble(scanner.nextLine());
        gb.setNota(y);

        joaoP.mostraMsg();
        gb.mostraMsg();
        
    }
    
}
