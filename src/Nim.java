import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class Nim {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        String player1;
        String player2;
        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;
        String choice;
        int removeNumber;

        System.out.print("Player 1, enter your name: ");
        player1 = keyBoard.next();
        System.out.print("Player 2, enter your name: ");
        player2 = keyBoard.next();

        int count = 0;
        do {
            if (count % 2 == 0){ //allows for the determination of player 1
                System.out.println("\nA: " + pile1 + "\t B: " + pile2 + "\t C: " + pile3);
                System.out.print("\n" + player1 + " choose a pile (A, B, or C): ");
                choice = keyBoard.next(); //allows player to choose which pile
                System.out.print("How many to remove from Pile " + choice + ": ");
                removeNumber = keyBoard.nextInt(); //allows player to choose how many to remove
                while (removeNumber > 3) { //makes sure the player doesn't remove more than alloted number of 3
                    System.out.print("That is not allowed. Try again: ");
                    choice = keyBoard.next();
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                }
                while (pile1 < 0 || pile2 < 0 || pile3 < 0) { //makes sure player doesn't remove extra from an empty pile
                    System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
                    choice = keyBoard.next();
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                }
                while (removeNumber == 0) { //makes sure player is at least choosing 1
                    System.out.print("You must choose at least 1. How many? ");
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                    }
                if (choice.equals("A"))
                    pile1 = pile1 - removeNumber;
                else if (choice.equals("B"))
                    pile2 = pile2 - removeNumber;
                else if (choice.equals("C"))
                    pile3 = pile3 - removeNumber;
                count++;
            }
            else { //player 2 with same paramaters as player1
                System.out.println("\nA: " + pile1 + "\t B: " + pile2 + "\t C: " + pile3);
                System.out.print("\n" + player2 + " choose a pile (A, B, or C): ");
                choice = keyBoard.next();
                System.out.print("How many to remove from Pile " + choice + ": ");
                removeNumber = keyBoard.nextInt();
                while (removeNumber > 3) {
                    System.out.print("That is not allowed. Try again: ");
                    choice = keyBoard.next();
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                }
                while (pile1 < 0 || pile2 < 0 || pile3 < 0) {
                    System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
                    choice = keyBoard.next();
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                }
                while (removeNumber == 0) {
                    System.out.print("You must choose at least 1. How many? ");
                    System.out.print("How many to remove from Pile " + choice + ": ");
                    removeNumber = keyBoard.nextInt();
                }
                if (choice.equals("A"))
                    pile1 = pile1 - removeNumber;
                else if (choice.equals("B"))
                    pile2 = pile2 - removeNumber;
                else if (choice.equals("C"))
                    pile3 = pile3 - removeNumber;
                count++;
            }
        } while(pile1 > 0 || pile2 > 0 || pile3 > 0); //keeps the loop going until all piles are empty

        System.out.println("\nA: " + pile1 + "\t B: " + pile2 + "\t C: " + pile3);
        System.out.println("\nThis game took " + count + " turns."); //counted number of turns
        if (count % 2 == 0) //player who chose last loses
            System.out.print(player1 + ", there are no counters left, so you WIN!");
        else if (count % 2 == 1)
            System.out.print(player2 + ", there are no counters left, so you WIN!");




    }
}
