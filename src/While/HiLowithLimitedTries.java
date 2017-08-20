package While;

import java.util.*;

/**
 * Created by dk on 8/16/2017.
 */
public class HiLowithLimitedTries {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        Random r = new Random();
        int answer = 1 + r.nextInt(100);

        System.out.print("I'm thinking of a number between 1-100. You have 7 guesses\nFirst guess: ");
        int guess = keyBoard.nextInt();

        int count = 1;
        while (guess != answer && count <= 7) {
            if (guess < answer) {
                System.out.println("Sorry, you are too low.");
                System.out.print("Guess # " + count + ": ");
                guess = keyBoard.nextInt();
                count++;
            } else if (guess > answer) {
                System.out.println("Sorry, that guess is too high.");
                System.out.print("Guess # " + count + ": ");
                guess = keyBoard.nextInt();
                count++;
            }
        }

        if (guess == answer)
            System.out.println("You guessed it! What are the odds?!?");
        else if (count > 7)
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");

    }
}