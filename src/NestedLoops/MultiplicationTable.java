package NestedLoops;

/**
 * Created by dk on 8/28/2017.
 */
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print(" x | ");
        for (int x = 1; x < 10; x++)
            System.out.printf("%3d ", (x));
        System.out.println("\n==+======================================");
        for (int i = 1; i < 13; i++) {
            System.out.printf("%2d %1s ", i, "|");
            for (int j = 1; j < 10; j++)
                System.out.printf("%3d ", (j*i));
            System.out.println();


        }
    }


}
