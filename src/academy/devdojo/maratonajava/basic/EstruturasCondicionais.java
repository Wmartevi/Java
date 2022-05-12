package academy.devdojo.maratonajava.basic;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 18;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizado){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        //Prova Certificação
        boolean c = false;

        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

    }
}
