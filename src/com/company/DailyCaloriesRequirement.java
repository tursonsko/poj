/*
 * This program calc for user Total Metabolic Rate (TMR). First, user put sex preferences,
 * then user need to put weight, height and age. After correct inputs program will calculate Basic Metabolic Rate
 * and then program ask about physical activity. User need to choose one of six option, and then program return
 * Daily Calories Requirement
 * Author: Wojtek
 * */

package com.company;

import java.util.Scanner;

public class DailyCaloriesRequirement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nSelect a gender to calculate the total daily calories (Total Metabolic Rate - TMR)");
        System.out.println("[1] - Female\n[2] - Male");

        int sex = scan.nextInt();

        //menu driver to choose sex (male/female)
        switch(sex) {
            case 1:
                /*function totalMetabolicRate() takes as a parameter function harrisBenedictPatter()
                with parameters (param1-4 in 38th line) for FEMALE gender*/
                System.out.println("Your Total Metabolic Rate is: " + totalMetabolicRate(harrisBenedictPattern(655.1F, 9.563F, 1.85F, 4.676F)));
                break;
            case 2:
                /*function totalMetabolicRate() takes as a parameter function harrisBenedictPatter()
                with parameters (param1-4 in 38th line) for MALE gender*/
                System.out.println("Your Total Metabolic Rate is: " + totalMetabolicRate(harrisBenedictPattern(66.5F, 13.75F, 5.003F, 6.175F)));
                break;
            default:
                System.out.println("You did not enter a valid value");
                break;
        }

    }

    //function which calculates and return basic metabolic rate - Harris-Benedict pattern
    public static int harrisBenedictPattern(float param1, float param2, float param3, float param4) {

        int basicMetabolicRate;

        Scanner scan = new Scanner(System.in);

        int bodyWeight;
        //validation
        do {
            System.out.println("Give the body weight in kilograms, give the WHOLE POSITIVE number");
            while(!scan.hasNextInt()) {
                System.out.println("You did not enter a WHOLE POSITIVE number value... Don't give up! Try again!");
                scan.next();
            }
            bodyWeight = scan.nextInt();
        } while (bodyWeight <= 0);

        int bodyHeight;
        //validation
        do {
            System.out.println("Give the body height in kilograms, give the WHOLE POSITIVE number");
            while(!scan.hasNextInt()) {
                System.out.println("You did not enter a WHOLE POSITIVE number value... Don't give up! Try again!");
                scan.next();
            }
            bodyHeight = scan.nextInt();
        } while (bodyHeight <= 0);

        int age;
        //validation
        do {
            System.out.println("Give your age, give the WHOLE POSITIVE number");
            while(!scan.hasNextInt()) {
                System.out.println("You did not enter a WHOLE POSITIVE number value... Don't give up! Try again!");
                scan.next();
            }
            age = scan.nextInt();
        } while (age <= 0);


        //Harris-Benedict pattern
        basicMetabolicRate = (int)(param1 + (param2 * bodyWeight) + (param3 * bodyHeight) - (param4 * age));

        return basicMetabolicRate;

    }


    /*function, which calculates total metabolic rate - it is basic metabolic rate times parameter,
    which depends on type of program's user activity*/
    public static int totalMetabolicRate(int basicMetabolicRate) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select the appropriate category of physical activity for you");
        System.out.println("[1] - lack of physical activity"); //bmr * 1
        System.out.println("[2] - low physical activity"); //bmr * 1.2
        System.out.println("[3] - training about 2 times a week"); //bmr * 1.4
        System.out.println("[4] - average activity, training about 3-4 times a week"); //bmr * 1.6
        System.out.println("[5] - increased activity, training 4-5 times a week"); //bmr * 1.8
        System.out.println("[6] - very high physical activity, 5 and more daily workouts"); // bmr * 2

        int option = scan.nextInt();
        int tmr = 0;

        //menu driver used to calculate with appropriate program's user activity preferences
        switch(option) {
            case 1:
                tmr = basicMetabolicRate;
                break;
            case 2:
                tmr = (int)(basicMetabolicRate * 1.2);
                break;
            case 3:
                tmr = (int)(basicMetabolicRate * 1.4);
                break;
            case 4:
                tmr = (int)(basicMetabolicRate * 1.6);
                break;
            case 5:
                tmr = (int)(basicMetabolicRate * 1.8);
                break;
            case 6:
                tmr = basicMetabolicRate * 2;
                break;
            default:
                System.out.println("You did not enter a valid value");
                break;

        }

        return tmr;

    }
}
