package academy.devdojo.maratonajava.sobrecargametodos.test;

import academy.devdojo.maratonajava.sobrecargametodos.dominio.Seriados;

public class SeriadosTest01 {
    public static void main(String[] args) {
        Seriados seriados = new Seriados();
        seriados.init("Vikings", "Épico", 8, "Ação");

        System.out.println(seriados.getNome());
    }
}
