import java.util.*;

/**
 * Created by dk on 8/16/2017.
 */
public class AgainwiththeNumberGuessing {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        Random r = new Random();
        int rNumber = 1 + r.nextInt(10);
        int guess;

        System.out.println("TEN WORST NUBMER GESSING GAME EVAR!!!!!!1!");
        System.out.print("\nI\"M THKIG OF A NBR FROM 1-10. Try 2 GESS! \nYour guess: ");

        guess = keyBoard.nextInt();

        int count = 1;
        if (guess != rNumber) {

            do {
                System.out.print("That is incorrect. Guess again.\nYour guess: ");
                guess = keyBoard.nextInt();
                count++;
            }
            while (guess != rNumber);
        }

        System.out.print("That's right! You're a good guesser. Number of tries: " + count);

    }
}
