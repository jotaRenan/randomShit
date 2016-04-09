/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidencia;

/**
 *
 * @author usuario
 */
public class Eleicao {
    
    private Candidatos[] candidatos;
    private Candidatos vencedor;
    //private int 
    
    public Eleicao() {
        candidatos = new Candidatos[4];
    }
   
    public Eleicao(Candidatos[] candidatos) {
        this.candidatos = candidatos;
        Gui gui = new Gui(this);
    }
    
    public void calcRes() {
        
        for (int i=0; i < candidatos.length; i++) {
            if (candidatos[i].getVotos() > (Candidatos.getTotal() - candidatos[i].getVotos()) ) {
                vencedor = candidatos[i];
            }
        }
        if (vencedor == null) {
            //segundo turno;
           
        }
        
    }

    public Candidatos[] getCandidatos() {
        return candidatos;
    }

    public Candidatos getVencedor() {
        return vencedor;
    }
    
}
