/**
 * Armstrong Number Program (Exercise 24)
 * Author Wojtek Turek
 */

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        armstrongTest();
    }

    public static void armstrongTest() {

        System.out.println("Please enter three-digit number to verify, if it is the Armstrong Number");
        int number = new Scanner(System.in).nextInt();

        System.out.println("The number is: " + number);

        int numberToCompare = number;
        int result = 0;

        while(number > 0) {
            int temp = number % 10;
            result += Math.pow(temp, 3);
            number /= 10;
        }

        String answer = (result == numberToCompare) ?
                "Hurray! Number " + numberToCompare + " is the Armstrong Number" :
                "Sorry, number " + numberToCompare + " is not the Armstrong Number";

        System.out.println(answer);
    }
}
