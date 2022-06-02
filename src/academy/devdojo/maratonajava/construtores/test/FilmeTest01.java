package academy.devdojo.maratonajava.construtores.test;

import academy.devdojo.maratonajava.construtores.dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filme = new Filme("Jango Livre", "Ação", 160, "Sony");
        filme.imprime();

    }
}
