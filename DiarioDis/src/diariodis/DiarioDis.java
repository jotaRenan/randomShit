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
public class DiarioDis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diario joaoP = new Diario(9, 45);
        Diario gb = new Diario();
        
        int x = 50;
        double y = 3.7;
        
        gb.setFreq(x);
        gb.setNota(y);

        joaoP.mostraMsg();
        gb.mostraMsg();
        
    }
    
}
