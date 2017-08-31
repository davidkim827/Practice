package Arrays;

import java.util.Random;

/**
 * Created by dk on 8/29/2017.
 */
public class BasicArrays2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
            System.out.println("Slot " + i + " contains a " + array[i]);
        }

    }
}
