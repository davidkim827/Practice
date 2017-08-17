import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class OneShotHiLO {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = 1 + r.nextInt(100);

        System.out.print("I'm thinking of a number between 1-100. Try to guess it. \n> ");
        int guess = keyBoard.nextInt();

        if (guess == randomNumber)
            System.out.print("\nYou guessed it! What are the odds?!?!!?");
        else if (guess < randomNumber)
            System.out.print("\nSorry, you are too low. I was thinking of " + randomNumber +".");
        else
            System.out.print("\nSorry, you are too high. I was thinking of " + randomNumber + ".");



    }
}
