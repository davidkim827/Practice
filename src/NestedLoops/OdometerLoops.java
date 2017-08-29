package NestedLoops;

import java.util.Scanner;

/**
 * Created by dk on 8/28/2017.
 */
public class OdometerLoops {

    public static void main( String[] args ) throws Exception

    {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("What base? (2-10)");
        int base = keyBoard.nextInt();
        for ( int thous=0; thous<10; thous++ )

            for ( int hund=0; hund<10; hund++ )

                for ( int tens=0; tens<10; tens++ )

                    for ( int ones=0; ones<base; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }




        System.out.println();
    }

}
    /*
1. Delete all the open braces and close braces from all the outer  for loops. (Leave the curly braces that belong to the innermost loop (the "ones" loop).) Does it still work? Answer in a comment.
    Yes, it still works.

2. Change all the loops so that they count from 0 to 7 instead of 0 to 9. This will display numbers in "octal" (base 8) instead of "decimal" (base 10).

3. Change the code so that the human gets to type in a number for the base, and your odometer counts up to that instead of 8. You might want to increase the delay (put a bigger number (like maybe 500) inside the Thread.sleep()).

     */