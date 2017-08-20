package DoWhile;

import java.util.*;
/**
 * Created by dk on 8/17/2017.
 */
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int seedNumber;

        System.out.print("Starting number: ");
        seedNumber = keyBoard.nextInt();
        int count = 0;

        while (seedNumber != 1) {
            System.out.print(seedNumber + "\t");
            if (seedNumber % 2 == 0) {
                seedNumber = seedNumber / 2;
                count++;
            } else {
                seedNumber = (seedNumber * 3) + 1;
                count++;
            }
            if (count % 10 == 0)
                System.out.print("\n");
        }
        System.out.print("1\nTerminated after " + count + " steps.");

    }
}