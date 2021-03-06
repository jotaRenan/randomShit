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
public class Diario {
    // -- Declara variaveis p/ nota, frequencia, conceito e resultado.
    private double nota;
    private int freq; 
    private char conceito;
    private boolean result;
    private String nome;
    
    // -- Construtor sem parametros
    Diario() {
    }
    
    // -- Construtor com parametros
    Diario(String nome, double nota, int freq) {
        this.nome = nome;
        this.nota = nota;
        this.freq = freq;
        calcCon();  // -- Chama metodo que calcula conceito
        isAproved();
    }
    
    // -- O metodo toString serve como "representacao" do objeto na forma de String
    public String toString() {
        return String.format("Nota: %.2f\nFreq: %d\n", nota, freq);
    }
    
    // -- Calcula conceito do aluno 
    private void calcCon() {
        if (freq <45 )
            conceito = 'F';
        else {
            if (nota >= 9.0 && nota <= 10.0) {
                conceito = 'A';
            } 
            else {
                if ( nota >= 7.0 && nota <=8.9 ) {
                    conceito = 'B';
                }
                else {
                    if ( nota >= 5.0 && nota <= 6.9) {
                        conceito = 'C';
                    }
                    else {
                        if (nota >= 4.5 && nota <= 4.9) {
                            conceito = 'D';
                        }
                        else
                            conceito = 'F';
                    }
                }
            }
        }
    }
    
    // -- Checa se o aluno foi aprovado e joga o resultado numa variavel
    public boolean isAproved () {
        result = (conceito < 'D' && freq >= 45);
        return result;
    }
    
    // -- Abaixo estao os metodos set e get
    public void setNota (double nota) {
        this.nota = nota;
        // -- Ja calcula conceito a partir da definicao da nota
        calcCon(); 
    }
    
    public void setFreq (int freq) {
        this.freq = freq;
    }
    
    public void setResult(boolean result) {
        this.result = result;
    }
    
    public void setConceito(char conceito) {
        this.conceito = conceito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getFreq() {
        return freq;
    }
    
    public double getNota() {
        return nota;
    }
    
    public boolean getResult() {
        return result;
    }
    
    public char getConceito() {
        return conceito;
    }
    
    /*
    // -- Metodo que mostra mensagem com tudo do aluno
    public void mostraMsg() {
        
        if ( isAproved() ) {
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.println("Aluno reprovado.");
        }
        // -- Abaixo esta o lindo operador ternario, que infelizmente nao eh mt legivel :c
        //System.out.println("Aluno " + (isAproved() ? "aprovado" : "reprovado"));  
        
        System.out.printf("Nota: %.2f\t Frequencia: %d/60 aulas.\n", nota, freq);
    }
    */
}
