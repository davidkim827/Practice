import java.util.*;
/**
 * Created by dk on 8/20/2017.
 */
public class AddingValueswithaForLoop {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        int number;
        int sum = 0;
        System.out.print("Number: ");
        number = keyBoard.nextInt();

        for (int n = 1; n <= number; n++){
            System.out.print(n + " ");
            sum = sum + n;
        }

        System.out.print("\nThe sum is " + sum + ".");

    }
}
