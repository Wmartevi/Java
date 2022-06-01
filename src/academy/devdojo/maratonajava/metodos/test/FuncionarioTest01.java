package academy.devdojo.maratonajava.metodos.test;

import academy.devdojo.maratonajava.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Janaina";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{1200, 1500, 1600};

        funcionario.imprime();


    }
}
