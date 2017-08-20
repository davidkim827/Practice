package RandomNumbers;

import java.util.*;
/**
 * Created by dk on 8/16/2017.
 */
public class FortuneCookie {
    public static void main(String[] args){
        Random m = new Random();
        int message = 1 + m.nextInt(6);
        Random r = new Random();
        int rNumber1 = 1 + r.nextInt(54);
        int rNumber2 = 1 + r.nextInt(54);
        int rNumber3 = 1 + r.nextInt(54);
        int rNumber4 = 1 + r.nextInt(54);
        int rNumber5 = 1 + r.nextInt(54);
        int rNumber6 = 1 + r.nextInt(54);



        String printMessage;
        if (message == 1)
            System.out.println("Fortune cookie says: \"You will find happiness with a new love.");
        else if (message == 2)
            System.out.println("Fortune cookie says: \"You will find handsomeness.");
        else if (message == 3)
            System.out.println("Fortune cookie says: \"You will find ugliness.");
        else if (message == 4)
            System.out.println("Fortune cookie says: \"You will find prettiness");
        else if (message == 5)
            System.out.println("Fortune cookie says: \"You will find a pencil");
        else if (message == 6)
            System.out.println("Fortune cookie says: \"You will find a squid");

        System.out.print("\t" + rNumber1 + " - " + rNumber2 + " - " + rNumber3 + " - " + rNumber4 + " - " + rNumber5 + " - "
                + rNumber6);
    }
}
