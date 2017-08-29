package Methods;
import java.util.*;
/**
 * Created by dk on 8/27/2017.
 */
public class Refresher {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        String name;
        System.out.print("What is your name: ");
        name = keyBoard.next();

        if (name.equals("Mitchell")) {
            for (int j = 1; j <= 5; j++)
                System.out.println(name);
        }
        else {
            for (int i = 1; i <= 10; i++)
                System.out.println(name);
        }

        }
    }

