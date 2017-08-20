import java.util.Scanner;

public class CountinFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}

//1. It allows for the count to go up so that the for loop can end
//2. Initializes the conditional variable upon which the for loop is based on
//3.