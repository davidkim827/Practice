package DoWhile;

import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class SafeSquareRoot {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");

        int number;

        System.out.print("Enter a number: ");
        number = keyBoard.nextInt();

        while (number < 0 ) {
            System.out.print("You can't take the square root of a negative number, silly.\nTry again: ");
            number = keyBoard.nextInt();
        }

        System.out.print("The square root of " + number + " is " + Math.sqrt(number) + ".");
    }
}
