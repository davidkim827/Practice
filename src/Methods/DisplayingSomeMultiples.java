package Methods;
import java.util.*;

/**
 * Created by dk on 8/27/2017.
 */
public class DisplayingSomeMultiples {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int choice;
        System.out.print("Choose a number: ");
        choice = keyBoard.nextInt();

        for (int i = 1; i <= 12; i++){
            System.out.println(choice + "x" + i + " = " + (choice * i));
        }
    }
}
