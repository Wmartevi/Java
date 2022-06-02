package academy.devdojo.maratonajava.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private  int[] episodios;

    //1 - Alocado espaco em memoria
    //2 - Cada atributo é criado e inicializado com valores default ou que for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public void imprime(){
        for (int episodio : this.episodios){
            System.out.println(episodio);
        }
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
        this.episodios = episodios;
    }
}
