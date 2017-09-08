package CSC202.Labs.Week3;

import CSC202.Labs.Week3.Item;
import CSC202.Labs.Week3.ShoppingBag;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //Scanner for reading from file
        Scanner file = null;
        ShoppingBag shoppingBag = null;

        try {
            file = new Scanner(new File("data.txt"));

            //Read first line from file
            if (file.hasNextLine()) {
                String line = file.nextLine().replaceFirst("\\s+", " ");   //Remove multiple spaces between words
                String[] tmpArr = line.split(" ");
                shoppingBag = new ShoppingBag(Float.parseFloat(tmpArr[0]), Integer.parseInt(tmpArr[1]));
            }

            //Read the rest of the file
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] tmpArr = line.split(" ");

                int size = tmpArr.length;
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < (size - 2); i++) {
                    sb.append(tmpArr[i] + " ");
                }

                shoppingBag.push(new Item(sb.toString().trim(),
                        Integer.parseInt(tmpArr[size - 2]),
                        Float.parseFloat(tmpArr[size - 1])));
            }

            //Display the shopping bag
            System.out.println(shoppingBag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //Close scanner
            if (file != null)
                file.close();
        }
    }
}