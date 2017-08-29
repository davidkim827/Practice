package FileIO;
import java.util.*;
import java.io.*;

/**
 * Created by dk on 8/28/2017.
 */
public class DisplayingAFile {
    public static void main(String[] args) throws Exception{
        Scanner keyBoard = new Scanner(System.in);

        String fileName;
        System.out.print("Open which file: ");
        fileName = keyBoard.next();

        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext())
            System.out.println(fileReader.nextLine());
    }
}
