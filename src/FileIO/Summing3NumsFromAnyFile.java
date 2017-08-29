package FileIO;
import java.util.*;
import java.io.*;

/**
 * Created by dk on 8/28/2017.
 */
public class Summing3NumsFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner keyBoard = new Scanner(System.in);

        String fileName;
        System.out.print("Which file would you like to read numbers from: ");
        fileName = keyBoard.next();

        File file = new File(fileName);
        Scanner readFile = new Scanner(file);
        int num1 = readFile.nextInt();
        int num2 = readFile.nextInt();
        int num3 = readFile.nextInt();

        System.out.println("Reading numbers from file " + "\"" + fileName + "\"\n");

        System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));


    }
}
