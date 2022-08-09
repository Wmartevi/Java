package academy.devdojo.maratonajava.basic;

public class EstruturaCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 50.500D;

        double tax1 = 9.70 / 100;
        double tax2 = 37.35 / 100;
        double tax3 = 49.50 / 100;
        double valorImposto;

        System.out.print("Taxa base de calculo = ");

        if (salario > 0 && salario <= 34.712){
            valorImposto = salario * tax1;
            System.out.println(tax1);
        }else if (salario >= 34.713 && salario <= 68.507 ){
            valorImposto = salario * tax2;
            System.out.println(tax2);
        }else {
            valorImposto = salario * tax3;
            System.out.println(tax3);
        }

        System.out.println("Salario Anual " + salario);
        System.out.println("Valor do Imposto " + valorImposto);



    }
}
