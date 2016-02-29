/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import java.util.Scanner;

class Empregados {

    Scanner scanner = new Scanner(System.in);
    private int horas;
    private double bruto, liquido, salHora, desconto;

    public Empregados() {
        this.setHoras();
        this.setSalHora();
        this.calcBoth();
    }

    public Empregados( int horas, float salHora ) {
        this.horas = horas;
        this.salHora = salHora;
        calcBoth();
    }

    private void calcBruto() { 
        bruto = horas*salHora;
    }

    private void calcLiq() {
        liquido = bruto * ( 1 - calcDesc());
    }    
    
    double calcDesc() {
        if (liquido <= 540)
            desconto = 0.11;
        else if (liquido > 540 && liquido <= 1500)
            desconto = 0.13;
        else 
            desconto = 0.2;
        return desconto;
    }

    private void calcBoth() {
        calcBruto();
        calcLiq();
    }

    int getHoras() {
        return horas;
    }

    double getSalHora() {
        return salHora;
    }

    double getLiq() {
        return liquido;
    } 

    double getBruto() {
        return bruto;
    }

    double getDesc() {
        return desconto;
    }

    void setSalHora() {
        System.out.println("Insira salario/hora: ");
        salHora = Double.parseDouble(scanner.nextLine());
    }

    void setHoras() {
        System.out.println("Insira horas trabalhadas: ");
        horas = Integer.parseInt(scanner.nextLine());
    }

}
