package FileIO;

import java.io.*;



/**
 * Created by dk on 8/28/2017.
 */
public class LetterRevisited {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("letter.txt");

        PrintWriter output = new PrintWriter(file);
        output.print("+---------------------------------------------------------+\n" +
                "|                                                    #### |\n" +
                "|                                                    #### |\n" +
                "|                                                    #### |\n" +
                "|                                                         |\n" +
                "|                                                         |\n" +
                "|                              Bill Gates                 |\n" +
                "|                              1 Microsoft Way            |\n" +
                "|                              Redmond, WA 98104          |\n" +
                "|                                                         |\n" +
                "+---------------------------------------------------------+\n");
        output.close();
    }
}
