package academy.devdojo.maratonajava.basic;

public class EstruturaCondicionaisTernario {
    public static void main(String[] args) {
        double salario = 4999;

        String msgDoar = "Eu vou doar 500";
        String msgNaoDoar = "Ainda não tenho condições";

        //String xxxxx = (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}
