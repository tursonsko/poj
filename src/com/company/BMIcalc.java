/*This is BMI program - body mass index calculator, user need to enter weight and height of his body and result will show
* if user is underweight, his weight is normal, he is overweight or obese
* Author: Wojtek
* */

package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BMIcalc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bodyWeight;
        //validattion
        do {
            System.out.println("Please put your body weight expressed in POSITIVE kilograms: ");
            while(!scan.hasNextDouble()) {
                System.out.println("You did not enter a number value... Don't give up! Try again!");
                scan.next();
            }
            bodyWeight = scan.nextDouble();
        } while (bodyWeight <= 0);


        double bodyHeightCm;
        //validation
        do {
            System.out.println("Please put your body height expressed in POSITIVE kilograms: ");
            while(!scan.hasNextDouble()) {
                System.out.println("You did not enter a number value... Don't give up! Try again!");
                scan.next();
            }
            bodyHeightCm = scan.nextDouble();
        } while (bodyHeightCm <= 0);



        double bodyHeightMeters = bodyHeightCm /100.0;

        // calculation of BMI
        double tempBMI = (bodyWeight / Math.pow(bodyHeightMeters, 2));

        //used to circle result of tempBMI
        BigDecimal bd = new BigDecimal(tempBMI).setScale(2, RoundingMode.HALF_UP);
        double BMI = bd.doubleValue();

        System.out.println("Your BMI equals: " + BMI);

        //condition responsible for BMI value classification
        if(BMI < 18.50) {
            System.out.println("Underweight");
        } else if(BMI >= 18.50 && BMI < 25.00) {
            System.out.println("Normal");
        } else if(BMI >= 25.00 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }

}
