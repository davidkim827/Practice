package DoLater;
import java.util.*;

/**
 * Created by dk on 8/23/2017.
 */
/*
public class KeychainsForSale {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        int numberofKeychains = 0;
        int pricePerKeychain = 10;
        int choice;
        System.out.println("Ye Olde Keychain Shoppe\n");

        do {
            System.out.println("1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order" +
                    "\n4. Checkout\n");
            System.out.print("Please enter your choice: ");
            choice = keyBoard.nextInt();
            if (choice == 1) {
                System.out.print("\nYou have " + numberofKeychains + ". ");
                numberofKeychains = numberofKeychains + add_keychains();
                System.out.println("You now have " + numberofKeychains + " keychains.\n");

            }
            else if (choice == 2) {
                System.out.print("\nYou have " + numberofKeychains + ". ");
                int removeKeychains = remove_keychains();
                while (removeKeychains > numberofKeychains)
                    System.out.println("\nNot valid. Please try again.")
                numberofKeychains = numberofKeychains - removeKeychains;
                while (numberofKeychains < 0) {
                    System.out.print("That is not a valid number. Please try again. ");
                    System.out.println("1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order" +
                            "\n4. Checkout\n");
                    System.out.print("Please enter your choice: ");
                    choice = keyBoard.nextInt();
                    System.out.print("You now have " + numberofKeychains + " keychains.");
                }
            }
            else if (choice == 3)
                view_order(numberofKeychains, pricePerKeychain);
            else if (choice == 4)
                checkout(numberofKeychains, pricePerKeychain);
        } while (choice != 4);

    }

    public static int add_keychains(){
        Scanner keyBoard = new Scanner(System.in);
        int addNumber;
        System.out.print("How many to add? ");
        addNumber = keyBoard.nextInt();
        while (addNumber < 0) {
            System.out.print("Not a valid option. Please try again.");
            System.out.print("How many to add? ");
            addNumber = keyBoard.nextInt();
        }
        return addNumber;
    }

    public static int remove_keychains(){
        Scanner keyBoard = new Scanner(System.in);
        int removeNumber;
        System.out.print("How many to remove? ");
        removeNumber = keyBoard.nextInt();
        while (removeNumber > ;)

        return removeNumber;
    }

    public static void view_order(int numberOfKeychains, int pricePerKeychain){
        System.out.println("You have " + numberOfKeychains + " keychains.");
        System.out.println("Keychains cost $" + pricePerKeychain + " each.");
        System.out.println("Total cost is $" + (numberOfKeychains * pricePerKeychain) + ".\n");
    }

    public static void checkout(int numberOfKeychains, int pricePerKeychain){
        Scanner keyBoard = new Scanner(System.in);
        String name;
        System.out.println("\nCHECKOUT\n");

        System.out.print("What is your name? ");
        name = keyBoard.next();
        System.out.println("You have " + numberOfKeychains + " keychains.");
        System.out.println("Keychains cost $" + pricePerKeychain + "each. ");
        System.out.println("Total cost is $" + (pricePerKeychain * numberOfKeychains) + ".");
        System.out.print("Thanks for your order, " + name + "!");
    }



}
*/
