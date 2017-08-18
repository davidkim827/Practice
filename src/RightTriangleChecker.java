import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class RightTriangleChecker {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int side1;
        int side2;
        int side3;

        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        side1 = keyBoard.nextInt();
        System.out.print("Side 2: ");
        side2 = keyBoard.nextInt();

        while (side1 > side2){
            System.out.println(side2 + " is smaller than " + side1 +". Try again.");
            System.out.print("Side 2: ");
            side2 = keyBoard.nextInt();
        }

        System.out.print("Side 3: ");
        side3 = keyBoard.nextInt();

        while (side2 > side3){
            System.out.println(side3 + " is smaller than " + side2 +". Try again.");
            System.out.print("Side 3: ");
            side3 = keyBoard.nextInt();
        }

        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        System.out.print("These sides *do* make a right triangle. Yippy-skippy!");

    }
}
