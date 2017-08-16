import java.util.Scanner;

/**
 * Created by dk on 8/14/2017.
 */
public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        String q1A;
        String q2A;

        System.out.print("Does it belong inside or outside or both? ");
        q1A = keyBoard.next();
        System.out.print("Is it alive? ");
        q2A = keyBoard.next();

        if (q1A.equals("inside") && (q2A.equals("yes") || q2A.equals("Yes")))
            System.out.print("It's a houseplant!");
        if (q1A.equals("inside") && (q2A.equals("no") || q2A.equals("No")))
            System.out.print("It's a houseplant!");
        if (q1A.equals("outside") && (q2A.equals("yes") || q2A.equals("Yes")))
            System.out.print("It's a Bison!");
        if (q1A.equals("outside") && (q2A.equals("no") || q2A.equals("No")))
            System.out.print("It's a Billboard!");
        if ((q1A.equals("both") || q1A.equals("Both")) && (q2A.equals("yes") || q2A.equals("Yes")))
            System.out.print("It's a Bison!");
        if ((q1A.equals("both") || q1A.equals("Both")) && (q2A.equals("no") || q2A.equals("No")))
            System.out.print("It's a Billboard!");
    }
}