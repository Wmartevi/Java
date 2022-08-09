package academy.devdojo.maratonajava.metodos.test;

import academy.devdojo.maratonajava.metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(4, 3);

        double resultado = calculadora.divideDoisNumeros(3,0);
        System.out.println(resultado);

        calculadora.imprimeDivisaoDeDoisNumeros(10,2);

        //Utilizando VarArgs
        calculadora.somaVarArgs(1,2,4);

        //Utilizando Arrays Tradicional
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArrays(numeros);
    }
}
