package academy.devdojo.maratonajava.blocosinicializacao.test;

import academy.devdojo.maratonajava.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        int [] episodios = {1,2,3,4,5,6,7};
        Anime anime = new Anime("Naruto",episodios);
        anime.imprime();
    }
}
