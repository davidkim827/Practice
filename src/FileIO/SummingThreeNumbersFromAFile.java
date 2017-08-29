package FileIO;
import java.util.*;
import java.io.*;
/**
 * Created by dk on 8/28/2017.
 */
public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("3nums.txt");
        Scanner fileReader = new Scanner(file);
        int num1 = fileReader.nextInt();
        int num2 = fileReader.nextInt();
        int num3 = fileReader.nextInt();
        System.out.println("Reading numbers from file " + "\"" + file +"\"... done.\n");

        System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));


    }
}
