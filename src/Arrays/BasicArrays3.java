package Arrays;

import java.util.Random;

/**
 * Created by dk on 8/29/2017.
 */
public class BasicArrays3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random r = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(99) + 10;
            System.out.print(array[i] + "  ");
        }
    }
}
