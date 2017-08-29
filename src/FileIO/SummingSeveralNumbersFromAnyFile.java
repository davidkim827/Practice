package FileIO;
import java.io.*;
import java.util.*;
/**
 * Created by dk on 8/29/2017.
 */
public class SummingSeveralNumbersFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyBoard = new Scanner(System.in);

        String fileName;
        System.out.print("Which file would you like to read from: ");
        fileName = keyBoard.next();
        System.out.print("Reading numbers from \"" + fileName + "\"\n\n");

        File file = new File(fileName);
        Scanner fileContent = new Scanner(file);

        int num = 0;
        while(fileContent.hasNextInt()){
            int numbers = fileContent.nextInt();
            System.out.print(numbers + " ");
            num = num + numbers;
        }



        System.out.print("\nTotal is " + num);
    }
}
