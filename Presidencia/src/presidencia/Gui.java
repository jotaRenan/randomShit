/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidencia;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author JOAO PEDRO RENAN UHULLLL
 */
public class Gui extends JFrame {

    private final JLabel titulo;
    private final JButton b1, b2, b3, b4, b5, b6, bResult;
    private final JPanel painel;
    private final Candidatos[] candidatos;
    private final Eleicao eleicao;

    public Gui(Eleicao eleicao) {

        super("Votacao");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.candidatos = eleicao.getCandidatos();
        this.eleicao = eleicao;

        painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));

        titulo = new JLabel("Vote");
        titulo.setFont(new Font("ARIAL", Font.BOLD, 15));

        //--Cria handlers de evento especificos para cada candidato
        HandlerClass c1 = new HandlerClass(candidatos[0]);
        b1 = new JButton(candidatos[0].getNome());
        b1.addActionListener(c1);

        HandlerClass c2 = new HandlerClass(candidatos[1]);
        b2 = new JButton(candidatos[1].getNome());
        b2.addActionListener(c2);

        HandlerClass c3 = new HandlerClass(candidatos[2]);
        b3 = new JButton(candidatos[2].getNome());
        b3.addActionListener(c3);

        HandlerClass c4 = new HandlerClass(candidatos[3]);
        b4 = new JButton(candidatos[3].getNome());
        b4.addActionListener(c4);

        //--Votos nulos e brancos nao fazem nada, essencialmente.
        b5 = new JButton("Nulo");
        b6 = new JButton("Branco");

        //--Declara JButton de resultado
        Resultado eResult = new Resultado();
        bResult = new JButton("Resultado");
        bResult.addActionListener(eResult);

        painel.add(titulo);
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(bResult);

        this.add(painel);
        this.setVisible(true);

    }

    private class HandlerClass implements ActionListener {

        private final Candidatos candidato;

        public HandlerClass(Candidatos candidato) {
            this.candidato = candidato;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            candidato.vote();
            try {
                tocaSom("C:\\Users\\Aluno\\Desktop\\randomShit-master\\Presidencia\\src\\presidencia\\barulho.wav");
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class Resultado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            //--Fecha a janela aberta
            dispose();
            //--Calcula resultado da eleicao
            eleicao.calcRes();

            JFrame frame;
            frame = new JFrame("Resultado eleicoes presidenciais");
            frame.setLayout(new GridLayout(2, 1));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);

            JTextArea resultado;
            resultado = new JTextArea();
            resultado.setEditable(false);
            resultado.setSize(300, 200);

            //--Calculos para resultado de eleicao
            if (eleicao.getVencedor() != null) {
                Candidatos vencedor = eleicao.getVencedor();
                resultado.append("Vencedor: " + vencedor.getNome());
                resultado.append("\nNmr de votos: " + vencedor.getVotos());
            } else {
                Candidatos[] segTurno = eleicao.getSegTurno();
                resultado.append("Havera segundo turno!");
                //--Exibe candidatos do 2o turno
                for (int i = 0; i < 2; i++) {
                    resultado.append("\n\nCandidato " + (i + 1) + ": " + segTurno[i].getNome());
                    resultado.append("\nVotos: " + segTurno[i].getVotos());
                }
            }

            JButton sair;
            sair = new JButton("Encerrar");
            sair.setSize(100, 200);
            sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                }
            });

            frame.add(resultado);
            frame.add(sair);
            frame.setVisible(true);

        }
    }

    private static void tocaSom(String arquivoPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        InputStream in = new FileInputStream(arquivoPath);

        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);

    }

}
