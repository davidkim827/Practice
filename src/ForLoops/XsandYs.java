package ForLoops;

import java.util.*;
/**
 * Created by dk on 8/20/2017.
 */
public class XsandYs {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        double y;
        System.out.printf("%-8s%-8s\n----------------\n", "x", "y");
        for (double n = -10; n <= 10; n = n + 0.5)
            System.out.printf("%-8.1f%-8.2f\n", n, (double) Math.pow(n, 2));
    }
}
