package academy.devdojo.maratonajava.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salarios[];

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprineMediaSalario();
    }

    public void imprineMediaSalario() {
        double media = 0;
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);

    }
}
