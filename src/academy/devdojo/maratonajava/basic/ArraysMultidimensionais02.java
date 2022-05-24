package academy.devdojo.maratonajava.basic;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{6,5,3,8,9,7};

        int[][] arrayInt2 = {{0,0}, {3,2,1}, {7,7,7,7,7,7}};

        for (int[] arrayBase:arrayInt2){
            System.out.println("\n---------------");
            for (int num:arrayBase){
                //System.out.println(arrayBase);
                System.out.print(num);
            }
        }
    }
}
