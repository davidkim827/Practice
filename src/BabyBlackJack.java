import java.util.*;
/**
 * Created by dk on 8/20/2017.
 */

public class BabyBlackJack {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        Random r1 = new Random();
        int card1 = 1 + r1.nextInt(10);
        Random r2 = new Random();
        int card2 = 1 + r2.nextInt(10);
        Random r3 = new Random();
        int card3 = 1 + r1.nextInt(10);
        Random r4 = new Random();
        int card4 = 1 + r2.nextInt(10);

        int total1 = card1+card2;
        int total2 = card3+card4;

        System.out.println("Baby Blackjack!\n");

        System.out.println("You drew " + card1 + " and " + card2 + ".");
        System.out.println("Your total is " + total1);

        System.out.println("\nThe dealer has " + card3 + " and " + card4 + ".");
        System.out.println("Dealer's total is " + total2);

        if (total1 > total2)
            System.out.print("\nYou win!");
        else
            System.out.print("\nYou lose. Dealer wins.");

    }
}
