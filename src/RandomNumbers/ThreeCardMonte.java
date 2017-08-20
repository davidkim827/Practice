package RandomNumbers;

import java.util.*;

/**
 * Created by dk on 8/17/2017.
 */
public class ThreeCardMonte {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        Random r = new Random();
        int answer = 1 + r.nextInt(3);

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash. " +
                        "He glances at you out of the corner of his eye and starts shuffling. " +
                        "He lays down three cards. \nWhich one is the ace?");
        System.out.print("\t\t## ## ##\n\t\t## ## ##\n\t\t1  2  3\n\n> ");
        int guess = keyBoard.nextInt();

        if (guess == answer)
            System.out.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        else
            System.out.print("Ha! Fast Eddie wings again! The ace was card number " + answer + ".");

    }
}
