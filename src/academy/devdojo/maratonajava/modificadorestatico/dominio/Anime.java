package academy.devdojo.maratonajava.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //1 - Bloco de inicialização é executado quando a JVM carregar a classe
    //2 - Alocado espaco em memoria
    //3 - Cada atributo é criado e inicializado com valores default ou que for passado
    //4 - Bloco de inicialização é executado
    //5 - Construtor é executado

    static {
        episodios = new int[100];
        System.out.println("Dentro do Bloco de Inicialização");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do Bloco de Inicialização 2");
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        Anime.episodios = episodios;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
