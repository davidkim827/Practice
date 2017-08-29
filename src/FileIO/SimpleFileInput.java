package FileIO;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by dk on 8/28/2017.
 */
public class SimpleFileInput {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("name.txt");
        Scanner readFile = new Scanner(file);
        String fName = readFile.next();
        String lName = readFile.next();

        System.out.print("Using my psychic powers (aided by reading data from the file), I have " +
                "determined that your name is " + fName + " " + lName + ".");
    }
}
