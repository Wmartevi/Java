package academy.devdojo.maratonajava.construtores.dominio;

public class Filme {
    private String nome;
    private String genero;
    private int duracao;
    private String estudio;

    public Filme(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme(String nome, String genero, int duracao, String estudio) {
        this(nome, genero, duracao);
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.duracao);
        System.out.println(this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
