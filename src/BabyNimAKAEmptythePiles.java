import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class BabyNimAKAEmptythePiles {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;
        String choice;
        int removeNumber;

        do {
            System.out.println("A: " + pile1 + "\t B: " + pile2 + "\t C: " + pile3);
            System.out.print("\nChoose a pile: ");
            choice = keyBoard.next();
            System.out.print("How many to remove from Pile " + choice + ": ");
            removeNumber = keyBoard.nextInt();
            if (choice.equals("A"))
                pile1 = pile1 - removeNumber;
            else if (choice.equals("B"))
                pile2 = pile2 - removeNumber;
            else if (choice.equals("C"))
                pile3 = pile3 - removeNumber;
        }
        while(pile1 != 0 || pile2 != 0 || pile3 != 0);

        System.out.print("\nAll piles are empty. Good job!");




    }
}
