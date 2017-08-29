package FileIO;
import java.util.*;
import java.io.*;
/**
 * Created by dk on 8/28/2017.
 */
public class HighScore {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner keyBoard = new Scanner(System.in);
        int score;
        String name;

        File file = new File("score.txt");
        PrintWriter output = new PrintWriter(file);

        System.out.println("You got a high score!");
        System.out.print("Please enter your score: ");
        score = keyBoard.nextInt();
        System.out.print("Please enter your name: ");
        name = keyBoard.next();

        output.print(score + "\n" + name);
        output.close();
        System.out.print("Data stored into " + file);

    }
}
