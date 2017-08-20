package If;

import java.util.Scanner;

/**
 * Created by dk on 7/13/2017.
 */
public class AgeMessages3 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Your name: ");
        name = keyBoard.next();
        System.out.print("Your age: ");
        age = keyBoard.nextInt();

        if (age > 0 && age < 16)
            System.out.println("\nYou can't drive, " + name + ".");
        if (age > 15 && age < 18)
            System.out.println("\nYou can drive but not vote, " + name + ".");
        if (age > 17 && age < 25)
            System.out.println("\nYou can vote but not rent a car, " + name + ".");
        if (age > 24)
            System.out.println("\nYou can do pretty much anything, " + name + ".");


    }
}
