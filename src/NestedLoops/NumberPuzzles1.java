package NestedLoops;

/**
 * Created by dk on 8/28/2017.
 */
public class NumberPuzzles1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 60; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i + j == 60 && i-j == 14) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}
