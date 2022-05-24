package academy.devdojo.maratonajava.classes.test;

import academy.devdojo.maratonajava.classes.dominio.Estudante;
import academy.devdojo.maratonajava.classes.dominio.Professor;

public class ClassesTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.idade = 38;
        estudante.sexo = 'M';

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 55;
        professor.sexo = 'F';


        System.out.println("Nome Aluno: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
        System.out.println("Nome Professor: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);


    }

}
