package If;

import java.util.Scanner;
/**
 * Created by dk on 7/7/2017.
 */
public class BMICategories {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);

        int feet;
        float inches;
        int pounds;

        System.out.print("Your height (feet only): ");
        feet = keyBoard.nextInt();
        System.out.print("Your height (inches only): ");
        inches = keyBoard.nextFloat();
        System.out.print("Your weight in pounds: ");
        pounds = keyBoard.nextInt();

        float mass = (float)(pounds * 0.453592);
        float heightCm = (float)(((feet * 12) + inches) * 0.0254);

        float bmi = (float) ((mass) / Math.pow(heightCm, 2));
        System.out.println("Your BMI is " + bmi);

        if (bmi > 0 && bmi < 18.5)
            System.out.print("BMI Category: underweight");
        if (bmi >= 18.5 && bmi <= 24.9)
            System.out.print("BMI Category: normal weight");
        if (bmi >= 25.0 && bmi <= 29.9)
            System.out.print("BMI Category: overweight");
        if (bmi > 30.0)
            System.out.print("BMI Category: obese");

    }
}
