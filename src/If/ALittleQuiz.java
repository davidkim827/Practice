package If;

import java.util.Scanner;
/**
 * Created by dk on 7/7/2017.
 */
public class ALittleQuiz {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int countR = 0;
        int countQ = 0;

        System.out.print("Are you ready for a quiz? ");
        String answer = keyBoard.next();
        System.out.println("Okay here it comes!\n");

        int userInput;

        System.out.println("Q1) What is the capital of Alaska? \n\t1) Melbourne \n\t2) Anchorage \n\t3) Juneau\n");
        userInput = keyBoard.nextInt();
        if (userInput == 2) {
            System.out.println("\nThat's right!\n");
            countR += 1;
        } else
            System.out.println("\nSorry, Anchorage is the capital of Alaska.\n");
        countQ += 1;

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n\t 1) yes\n\t 2) no\n");
        userInput = keyBoard.nextInt();
        if (userInput == 2) {
            System.out.println("\nThat's right!\n");
            countR += 1;
        } else
            System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.\n ");
        countQ += 1;

        System.out.println("Q3) What is the result of 9+6/3? \n\t 1) 5\n\t 2) 11\n\t 3) 15/3\n");
        userInput = keyBoard.nextInt();
        if (userInput == 3) {
            System.out.println("\nThat's right!\n");
            countR += 1;
        } else
            System.out.println("\nSorry, that's not the right answer. ");
        countQ += 1;

        System.out.println("\nOverall, you got " + countR + " out of " + countQ + " correct. \nThanks for playing!");
    }
}
