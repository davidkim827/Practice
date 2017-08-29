package NestedLoops;

/**
 * Created by dk on 8/28/2017.
 */
public class GettingIndividualDigits {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                System.out.println( i + "" + j + ", " + i + "+" + j + " = " + (i+j));
            }
            System.out.println();
        }
    }
}
