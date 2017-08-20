package KeyboardInput;

import java.util.Scanner;
/**
 * Created by dk on 7/7/2017.
 */
public class ADumbCalculator {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        float fNumber;
        float sNumber;
        float tNumber;

        System.out.print("What is your first number? ");
        fNumber = keyBoard.nextFloat();
        System.out.print("What is your second number? ");
        sNumber = keyBoard.nextFloat();
        System.out.print("What is your third number? ");
        tNumber = keyBoard.nextFloat();

        System.out.print("\n( " + fNumber + " + " + sNumber + " + " + tNumber + " ) / 2 is... " + ((fNumber + sNumber
                + tNumber)/2));
    }
}
