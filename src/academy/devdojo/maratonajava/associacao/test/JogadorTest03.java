package academy.devdojo.maratonajava.associacao.test;

import academy.devdojo.maratonajava.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador jogador3 = new Jogador("Garrincha");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador_______");
        jogador1.imprime();
        System.out.println("-----Time-----");
        time.imprime();




    }

}
