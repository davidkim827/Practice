package If;

/**
 * Created by dk on 8/15/2017.
 */

//Compares
public class compareToChallenge {
    public static void main(String[] args) {
        System.out.print("Comparing \"dumb\" with \"dumber\" produces ");
        int a = "dumb".compareTo("dumber");
        System.out.println(a);

        System.out.print("Comparing \"fish\" with \"goldfish\" produces ");
        int b = "fish".compareTo("goldfish");
        System.out.println(b);

        System.out.print("Comparing \"computer\" with \"mouse\" produces ");
        int x = "computer".compareTo("mouse");
        System.out.println(x);

        System.out.print("Comparing \"a\" with \"b\" produces ");
        int y = "fs".compareTo("fc");
        System.out.println(y);
    }
}
