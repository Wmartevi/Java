package academy.devdojo.maratonajava.metodos.test;

import academy.devdojo.maratonajava.metodos.dominio.Estudante;
import academy.devdojo.maratonajava.metodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressora impressora = new Impressora();

        estudante.nome = "Maria";
        estudante.idade = 38;
        estudante.sexo = 'F';

        estudante2.nome = "Carlo";
        estudante2.idade = 40;
        estudante2.sexo = 'M';

        impressora.imprimeEstudante(estudante);
        impressora.imprimeEstudante(estudante2);



    }
}


