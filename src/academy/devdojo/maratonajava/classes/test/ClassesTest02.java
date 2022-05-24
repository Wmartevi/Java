package academy.devdojo.maratonajava.classes.test;

import academy.devdojo.maratonajava.classes.dominio.Carro;

public class ClassesTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2022;

        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2020;

        System.out.println("Carro: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Carro: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
