package RandomNumbers;

import java.util.*;

/**
 * Created by dk on 8/16/2017.
 */
public class RandomGuessing {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        Random r = new Random();
        int rNumber = 1 + r.nextInt(10);
        int guess;

        System.out.println("TEN WORST NUBMER GESSING GAME EVAR!!!!!!1!");
        System.out.print("\nI\"M THKIG OF A NBR FROM 1-10. Try 2 GESS! ");

        guess = keyBoard.nextInt();

        if (guess == rNumber)
            System.out.println("\nLOL!!! U GOT IT! I CANT BELEIVE U GESSED IT WAS " + rNumber + "!");
        else
            System.out.println("\nWOOT! U SUXOR!!! I PWN JOO!!! IT WAS " + rNumber + "!");
    }
}
