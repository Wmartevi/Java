package academy.devdojo.maratonajava.associacao.test;

import academy.devdojo.maratonajava.associacao.dominio.Escola;
import academy.devdojo.maratonajava.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Master");
        Professor professor1 = new Professor("Jiraya Senior");
        Professor professor2 = new Professor("Jiraya Junior");
        Professor[] professores = {professor, professor1, professor2};
        Escola escola = new Escola("College Master", professores);

        escola.imprime();
    }
}
