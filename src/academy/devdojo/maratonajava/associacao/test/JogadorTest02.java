package academy.devdojo.maratonajava.associacao.test;

import academy.devdojo.maratonajava.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador.setTime(time);

        jogador.imprime();



    }
}
