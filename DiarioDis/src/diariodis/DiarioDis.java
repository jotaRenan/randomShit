/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodis;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
        Diario joaoP = new Diario("Joao Pedro", 9, 45);
        Diario gb = new Diario();
        
        int x;
        double y;

        // -- Recebe valores e manda pra classe
        x = Integer.parseInt(MsgsDiario.setFreq());
        gb.setFreq(x);
        y = Double.parseDouble(MsgsDiario.setNota());
        gb.setNota(y);
        
        gb.setNome("Gabriel Baiano");
        
        // -- Checa se objeto foi aprovado
        gb.isAproved();
        
        // -- Exibe mensagens
        MsgsDiario.result(gb);
        MsgsDiario.result(joaoP);
        
        // -- Exibe mensagem com textArea
        JTextArea caixaSaida = new JTextArea( 5, 20 );
        caixaSaida.append("Aluno\tFrequencia\tConceito\tAprovado?\n");
        
        caixaSaida.append( joaoP.getNome() + '\t' + joaoP.getFreq() + '\t' +
                joaoP.getConceito() + '\t' + joaoP.isAproved() + '\n');
        
        caixaSaida.append( gb.getNome() + '\t' + gb.getFreq() + 
                '\t' + gb.getConceito() + '\t' + gb.isAproved() + '\n');
        
        caixaSaida.setEditable(false);
        
        //JOptionPane.showMessageDialog(null,caixaSaida, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Resultado Final");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);  // -- Codigo para centralizar
        frame.add(caixaSaida);
        frame.setVisible(true);
    }
    
}
