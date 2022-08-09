package academy.devdojo.maratonajava.basic;

import javax.xml.transform.stream.StreamSource;
import java.net.SocketTimeoutException;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double)numero2;
        System.out.println(resultado);

        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorVinte = 10 > 20;
        System.out.println(isDezMaiorVinte);

        boolean isDezMenorVinte = 10 < 20;
        System.out.println(isDezMenorVinte);

        // && (AND) || (OR) ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500F;

        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation ||  valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel " + isPlaystationCompravel);

    }
}
