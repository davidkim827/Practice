package ForLoops;

import java.util.*;
/**
 * Created by dk on 8/20/2017.
 */
public class CountingMachine {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int number;
        System.out.print("Count to: ");
        number = keyBoard.nextInt();

        for (int n=0; n <= number; n++)
            System.out.print(n + " ");
    }
}
