import java.util.*;
/**
 * Created by dk on 8/20/2017.
 */
public class CountingbyHalves {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("x\n----------");

        for(double n = -10; n <= 10; n = n+0.5)
            System.out.println(n);
    }
}
