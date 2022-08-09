package academy.devdojo.maratonajava.metodos.test;

import academy.devdojo.maratonajava.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos Henrique");
        pessoa.setIdade(21);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.imprime();
    }
}
