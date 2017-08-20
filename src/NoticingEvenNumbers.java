import java.util.*;

/**
 * Created by dk on 8/20/2017.
 */
public class NoticingEvenNumbers {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        for (int n = 1; n <= 20; n++){
            if (n % 2 == 1)
                System.out.println(n);
            else
                System.out.println(n + " <");
        }
    }
}
