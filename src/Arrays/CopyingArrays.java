package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dk on 8/29/2017.
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1;
        Random r = new Random();

        for (int i = 0; i < array.length; i++){
            int num = r.nextInt(100) + 1;
            array[i] = num;
        }

        array1 = array;

        System.out.print("Array 1: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nArray 2: ");
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");

        }
    }