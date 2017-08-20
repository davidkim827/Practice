package While;

import java.util.*;

/**
 * Created by dk on 8/17/2017.
 */
public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();
        Random r1 = new Random();
        int randomDice1 = 1 + r.nextInt(6 );
        int randomDice2 = 1 + r1.nextInt(6);

        System.out.println("HERE COMES THE DICE!\n");

        while (randomDice1 != randomDice2) {
            System.out.println("Roll #1: " + randomDice1);
            System.out.println("Roll #2: " + randomDice2);
            System.out.println("The total is " + (randomDice1 + randomDice2) + "!");
            randomDice1 = 1 + r.nextInt(6 );
            randomDice2 = 1 + r1.nextInt(6);
        }

        System.out.println("Roll #1: " + randomDice1);
        System.out.println("Roll #2: " + randomDice2);
        System.out.print("The total is " + (randomDice1 + randomDice2) + "!");
    }
}
