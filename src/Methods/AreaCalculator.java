package Methods;
import java.util.*;
/**
 * Created by dk on 8/23/2017.
 */
public class AreaCalculator {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int choice;
        int base, height;       //triangle inputs
        int radius;             //circle input
        int side;               //square input
        int length, width;      //rectangle input

        System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");


        do{
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) " +
                    "Quit\nWhich shape: ");
            choice = keyBoard.nextInt();
            if (choice == 1) {                                                          //triangle choice
                System.out.print("\nBase: ");
                base = keyBoard.nextInt();
                System.out.print("Height: ");
                height = keyBoard.nextInt();

                System.out.println("\nThe area is " + area_triangle(base, height) + ".");
            } else if (choice == 2) {                                                   //rectangle choice
                System.out.print("\nLength: ");
                length = keyBoard.nextInt();
                System.out.print("Width: ");
                width = keyBoard.nextInt();

                System.out.println("\nThe area is " + area_rectangle(length, width));
            } else if (choice == 3) {                                                   //square choice
                System.out.print("\nSide: ");
                side = keyBoard.nextInt();

                System.out.println("\nThe area is " + area_square(side));
            } else if (choice == 4) {                                                   //circle choice
                System.out.print("\nRadius: ");
                radius = keyBoard.nextInt();

                System.out.println("\nThe area is " + area_circle(radius));
            }
        } while (choice != 5);

        System.out.print("\nGoodbye.");
    }



    public static double area_circle( int radius ) {             // returns the area of a circle
        double area;
        area = (double) Math.PI *(Math.pow(radius, 2));
        return area;
    }

    public static int area_rectangle( int length, int width ){   // returns the area of a rectangle
        int area;
        area = length * width;
        return area;
    }

    public static int area_square( int side ) {                   // returns the area of a square
        int area;
        area = (int)Math.pow(side, 2);
        return area;
    }

    public static double area_triangle( int base, int height ) { // returns the area of a triangle
        double area;
        area = ((0.5) * base * height);

        return area;
    }



}
