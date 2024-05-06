/*
  By Sósthenes Oliveira Lima
  22/04/2024
  Finalização
 */

package br.com.sosthenes.minhasmusicas.principal;

import br.com.sosthenes.minhasmusicas.modelos.MinhasPreferidas;
import br.com.sosthenes.minhasmusicas.modelos.Musica;
import br.com.sosthenes.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica =  new Musica();
        minhaMusica.setTitulo("Inferno");
        minhaMusica.setCantor("AntiDemon");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
            
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Sósthenes Lima");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
            
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();

            
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }

}
