package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();

        String again = "";

        int flip = rng.nextInt(2);
        String coin = "";

        do{
            System.out.println( "You flip a coin and it is... " + coin );
            System.out.print( "Would you like to flip again (y/n)? " );
            again = keyboard.next();


        }

        while ( again.equals("y") );


    }
}