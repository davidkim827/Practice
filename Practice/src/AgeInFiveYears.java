import java.util.Scanner;

/**
 * Created by dk on 7/7/2017.
 */
public class AgeInFiveYears {
    public static void main(String[] args){

        Scanner keyBoard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hello. What is your name? ");
        name = keyBoard.next();
        System.out.print("\nHi, " + name + "! How old are you? ");
        age = keyBoard.nextInt();
        System.out.println("\nDid you know that in five years you will be "+ (age + 5) + " years old?\nAnd five " +
                "years ago you were " + (age - 5) + "! Imagine that!");
    }
}
