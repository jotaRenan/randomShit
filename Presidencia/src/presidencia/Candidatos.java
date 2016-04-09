package presidencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
class Candidatos {
    private String nome;
    private int votos;
    private static int total=0;

    Candidatos() {
        this.votos = 0;
        this.nome = "Default";
    }

    public Candidatos(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public Candidatos(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public void vote() {
        votos++;
        total++;
    }
    
    public int getVotos() {
        return votos;
    }
    public void setNome(String name) {
        nome = name;
    }
    public String getNome() {
        return this.nome;
    }
    
    public static int getTotal() {
        return total;
    }
    
}
