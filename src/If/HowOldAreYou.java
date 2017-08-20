package If;

import java.util.Scanner;
/**
 * Created by dk on 7/7/2017.
 */
public class HowOldAreYou {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hey, what's your name? ");
        name = keyBoard.next();
        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyBoard.nextInt();

        if (age < 16)
            System.out.println("You can't drive");
        if (age < 18)
            System.out.println("You can't vote.");
        if (age < 25)
            System.out.println("You can't rent a car.");
        else
            System.out.println("You can do anything that's legal.");
    }
}
