package Arrays;

/**
 * Created by dk on 8/29/2017.
 */
public class BasicArrays1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = -113;
            System.out.println("Slot " + i + " contains a " + array[i]);
        }

    }
}
