package If;

import java.util.*;
/**
 * Created by dk on 8/15/2017.
 */
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        String lName;

        System.out.print("What's your last name? ");
        lName = keyBoard.next();

        int compNumber = lName.compareTo("Carswell");
        int compNumber1 = lName.compareTo("Jones");
        int compNumber2 = lName.compareTo("Smith");
        int compNumber3 = lName.compareTo("Young");

        if (compNumber <= 0)
            System.out.print("You don't have to wait long, " + lName);
        else if (compNumber1 <= 0)
            System.out.print("That's not bad");
        else if (compNumber2 <= 0)
            System.out.print("Looks like a bit of a wait");
        else if (compNumber3 <= 0)
            System.out.print("It's gonna be a while");
        else
            System.out.print("Not going anywhere for a while?");
    }
}
