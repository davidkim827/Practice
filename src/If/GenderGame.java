package If;

import java.util.Scanner;
/**
 * Created by dk on 8/15/2017.
 */
public class GenderGame {
    public static void main (String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        String gender;
        String fName;
        String lName;
        int age;
        String mAnswer;


        System.out.print("What is your gender (M or F): ");
        gender = keyBoard.next();
        System.out.print("First name: ");
        fName = keyBoard.next();
        System.out.print("Last name: ");
        lName = keyBoard.next();
        System.out.print("Age: ");
        age = keyBoard.nextInt();


        if (gender.equals("F") && age >= 20) {
            System.out.print("Are you married, " + fName + " (y or n)? ");
            mAnswer = keyBoard.next();
            if (mAnswer.equals("n"))
                System.out.print("\n\nThen I shall call you Ms. " + lName + ".");
            if (mAnswer.equals("y"))
                System.out.print("\nThen I shall call you Mrs. " + lName + ".");
        }
        else if (gender.equals("F") && age < 20)
            System.out.print("\nThen I shall call you " + fName + " " + lName + ".");
        else if (gender.equals("M") && age >= 20)
            System.out.print("\nThen I shall call you Mr. " + lName + ".");
        else if (gender.equals("M") && age < 20)
            System.out.print("\nThen I shall call you " + fName + " " + lName + ".");
    }
}
