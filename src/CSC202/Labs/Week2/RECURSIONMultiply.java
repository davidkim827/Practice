package CSC202.Labs.Week2;

import java.util.Scanner;

/**
 * Created by dk on 8/31/2017.
 */
public class RECURSIONMultiply {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int a;
        int b;
        System.out.println("Two numbers you want to multiply: ");
        a = keyBoard.nextInt();
        b = keyBoard.nextInt();

        if (a < 0 || b < 0)
            System.exit(1);
        else
            System.out.print(multiply(a, b));

    }

    public static int multiply(int a, int b){

        if (b == 0)
            return 0;
        if (b == 1)
            return a;
        else
            return a + multiply(a,b - 1);
    }
}
