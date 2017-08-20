package While;

import java.util.Scanner;

/**
 * Created by dk on 8/17/2017.
 */
public class AddingValuesinaLoop {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int userInput;
        int userInputTotal = 0;


        System.out.print("I will add up the numbers you give me.\nNumber: ");
        userInput = keyBoard.nextInt();

        userInputTotal = userInput + userInputTotal;
        while(userInput != 0) {
            System.out.println("The total so far is " + (userInputTotal));
            System.out.print("Number: ");
            userInput = keyBoard.nextInt();
            userInputTotal = userInput + userInputTotal
            ;
        }
        System.out.println("\nThe total is " + userInputTotal);
    }
}
