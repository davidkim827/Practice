import java.util.Scanner;

public class TwoQuestions{
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Two Questions!\nThink of an object, and I'll try to guess it.");

        String q1;
        String q2;
        String guess ="";

        System.out.println("\nQuestion 1) Is it animal, vegetable, or mineral?");
        q1 = keyBoard.next();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        q2 = keyBoard.next();

        if (q1.equals("animal")) {
            if (q2.equals("yes"))
                guess = "squirrel";
            else if (q2.equals("no"))
                guess = "moose";
        }

        if (q1.equals("vegetable")) {
            if (q2.equals("yes"))
                guess = "watermelon";
            else if (q2.equals("no"))
                guess = "carrot";
        }

        if (q1.equals("mineral")) {
            if (q2.equals("yes"))
                guess = "Camaro";
            else if (q2.equals("no"))
                guess = "paper clip";
        }

        System.out.println("My guess is that you are thinking of a " + guess);
    }
}
