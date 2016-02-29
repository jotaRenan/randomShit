/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

class Empregados {

    
    private int horas;
    private double bruto, liquido, salHora, desconto;

    public Empregados() {
    }

    public Empregados( int horas, float salHora ) {
        this.horas = horas;
        this.salHora = salHora;
        desconto=0.11;
        calcBoth();
        
    }

    public void calcBruto() { 
        bruto = horas*salHora;
    }

    public void calcLiq() {
        liquido = bruto * ( 1 - desconto);
    }    
    
    double calcDesc() {
        if (bruto <= 540)
            desconto = 0.11;
        else {
            if (bruto <= 1500)
                desconto = 0.13;
            else
                desconto = 0.2;
        }
        return desconto;
    }

    public void calcBoth() {
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

    void setSalHora(double salHora) {
        this.salHora = salHora;
    }

    void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    public void printData() {
        System.out.println( "Salario/hora: " + salHora + "\tHoras: " + horas);
        System.out.println( "Bruto: R$ " + bruto + "\tLiquido: R$ " + liquido);
        System.out.println( "Percentual de desconto: " + 100*desconto+ '%');
        System.out.println();
    }
    
}
