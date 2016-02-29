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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Empregados robertinho[] = new Empregados[2];
        robertinho[0] = new Empregados();
        robertinho[1] = new Empregados(190, 12);
        
        System.out.println("Insira salario/hora: ");
        double x = Double.parseDouble(scanner.nextLine());
        robertinho[0].setSalHora(x);
        System.out.println("Insira horas trabalhadas: ");
        int y = Integer.parseInt(scanner.nextLine());
        robertinho[0].setHoras(y);
        
        robertinho[0].calcBruto();
        robertinho[0].calcDesc();
        robertinho[0].calcLiq();       
        
        for (Empregados emp : robertinho)   {    
            emp.printData();
        }
    }
    
}
