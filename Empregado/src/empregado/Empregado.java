/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

class Empregado {
    
    /**
     * @param args the command line arguments
     */

    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Empregados robertinho[] = new Empregados[2];
        robertinho[0] = new Empregados();
        robertinho[1] = new Empregados(190, 12);
        
        for (Empregados emp : robertinho)   {    
            System.out.println( "Bruto: R$ " + emp.getBruto());
            System.out.println( "Liquido: R$ " + emp.getLiq());
            System.out.println( "Percentual de desconto: " + 100*emp.getDesc()+ '%');
            System.out.println();
        }
    }
    
}
