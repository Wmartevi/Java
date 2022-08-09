package academy.devdojo.maratonajava.basic;

public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 8;
        while (count < 10){
            System.out.println(++count);
        }

        do{
            System.out.println("dentro do do-while");
        } while (count < 10);


        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
