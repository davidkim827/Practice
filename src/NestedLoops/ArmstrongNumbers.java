package NestedLoops;

/**
 * Created by dk on 8/28/2017.
 */
public class ArmstrongNumbers {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++)
            for (int j = 0; j <= 9; j++)
                for (int x = 0; x <= 9; x++) {
                    int a = ((100 * i) + (10 * j) + x);
                    if ((Math.pow(i,3) + Math.pow(j,3) + Math.pow(x,3) == a))
                        System.out.println(i + "" + j + "" + x);
                }
    }
}
