/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidencia;

/**
 *
 * @author JOAO PEDRO RENAN UHULL
 */
public class Eleicao {

    private Candidatos[] candidatos; //--Candidatos da eleicao
    private Candidatos[] segTurno; //--possiveis candidatos de segundo turno
    private Candidatos vencedor; //--Vencedor da eleicao

    public Eleicao() {
        candidatos = new Candidatos[4];
    }

    //--Construtor para array ja definido
    public Eleicao(Candidatos[] candidatos) {
        this.candidatos = candidatos;
        //--Ja chama GUI e inicia votacao
        Gui gui = new Gui(this);
    }

    //--Calcula resultado da eleicao
    public void calcRes() {
        for (int i = 0; i < candidatos.length; i++) {
            //--Acha candidato com maioria absoluta de votos
            if (candidatos[i].getVotos() > (Candidatos.getTotal() - candidatos[i].getVotos())) {
                vencedor = candidatos[i];
            }
        }
        //--Se nao achar, vencedor é null e vai pra segundo turno
        if (vencedor == null) {
            //--Cria array de candidatos do 2o turno
            segTurno = new Candidatos[2];
            for(int i =0; i < 2; i++) {
                segTurno[i] = new Candidatos();
            }
            //--Calcula candidatos q irao pro 2o turno
            for (int i = 0; i < candidatos.length; i++) {
                if (candidatos[i].getVotos() > segTurno[0].getVotos()) {
                    segTurno[0] = candidatos[i];
                } else if (candidatos[i].getVotos() > segTurno[1].getVotos()) {
                    segTurno[1] = candidatos[i];
                }
            }
        }
    }

    public Candidatos[] getCandidatos() {
        return candidatos;
    }

    public Candidatos getVencedor() {
        return vencedor;
    }

    public Candidatos[] getSegTurno() {
        return segTurno;
    }

    
}
