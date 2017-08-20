package If;

import java.util.Scanner;
/**
 * Created by dk on 7/7/2017.
 */
public class SpaceBoxing {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int weight;
        float planet;
        float venus = (float) 0.78;
        float mars = (float) 0.39;
        float jupiter = (float) 2.65;
        float saturn = (float) 1.17;
        float uranus = (float) 1.05;
        float neptune = (float) 1.23;

        System.out.print("Please enter your current weight: ");
        weight = keyBoard.nextInt();
        System.out.println("I have information for the following planets: \n1. Venus \n2. Mars\n3. Jupiter \n4. " +
                "Saturn \n5. Uranus \n6. Neptune \n\nWhich planet are you visiting? ");
        planet = keyBoard.nextInt();

        if (planet == 1)
            planet = venus;
        else if (planet == 2)
            planet = mars;
        else if (planet == 3)
            planet = jupiter;
        else if (planet == 4)
            planet = saturn;
        else if (planet == 5)
            planet = uranus;
        else
            planet = neptune;



        System.out.print("\nYour weight would be " + (weight * planet) + " pounds on that planet");
    }
}
