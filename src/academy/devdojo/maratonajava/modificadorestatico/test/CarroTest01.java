package academy.devdojo.maratonajava.modificadorestatico.test;

import academy.devdojo.maratonajava.modificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Honda", 200);
        Carro c2 = new Carro("Mercedes", 280);
        Carro c3 = new Carro("Ferrari", 350);

        Carro.setVelocidadeLimite(215);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
