package NestedLoops;

/**
 * Created by dk on 8/28/2017.
 */
public class BasicNestedLoops {
    public static void main(String[] args){

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print("(" + i + "," + j + ") ");
            System.out.println();
        }
    }
}
