package ForLoops;

import java.util.*;

/**
 * Created by dk on 8/20/2017.
 */
public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        int countFrom;
        int countTo;
        int countBy;

        System.out.print("Count from: ");
        countFrom = keyBoard.nextInt();
        System.out.print("Count to: ");
        countTo = keyBoard.nextInt();
        System.out.print("Count by: ");
        countBy = keyBoard.nextInt();

        for (int n = countFrom; n <= countTo; n = n + countBy)
            System.out.print(n + " ");
    }
}
