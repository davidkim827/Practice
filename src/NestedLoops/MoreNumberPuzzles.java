package NestedLoops;

import java.util.Scanner;

/**
 * Created by dk on 8/28/2017.
 */
public class MoreNumberPuzzles {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.print("1) Find two digit numbers <= 56 with sums of digits > 10\n" +
                    "2) Find two digit number minus number reversed which equals sum of digits\n" +
                    "3) Quit\n\n> ");
            choice = keyBoard.nextInt();
            if (choice == 1)
                choice1();
            else if (choice == 2)
                choice2();
        }
        System.out.println();
    }

    public static void choice1() {
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                int x = i * 10 + j;
                if (x <= 56 && i + j > 10) {
                    System.out.println(i + "" + j);
                }
            }
        }
        System.out.println();
    }
    public static void choice2(){
        System.out.println();
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                int x = i * 10 + j;
                int y = j * 10 + i;
                if ((x - y) == (i + j))
                    System.out.println(i + "" + j);

            }
        }
        System.out.println();
    }
}

