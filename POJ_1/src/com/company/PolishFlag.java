/*
 * This is a program which allows user to generate imitaion of polish flag,
 * it uses as signs from ascii table (186 and 205 codes), user can chose three sizes of flag,
 * user needs to put only one integer parameter (size), function polishFlag() is responsible for draw flag
 * Author: Wojtek
 * */

package com.company;
import java.util.Scanner;

public class PolishFlag {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the Polish flag imitation that the program will draw for You");
        System.out.println("[10] - SMALL\n[20] - MEDIUM\n[30] - LARGE");

        int size = scan.nextInt();

        //driver menu, necessity to choose one of three sizes of flag
        switch(size) {
            case 10:
                polishFlag(size);
                break;
            case 20:
                polishFlag(size);
                break;
            case 30:
                polishFlag(size);
                break;
            default:
                System.out.println("Invalid value specified");
                break;
        }

    }

    //function drawing imitation of polish flag
    public static void polishFlag(int size) {

        //loop drawing top edge of flag
        for (int i=0; i<size*3; i++) {
            System.out.print("═");
        }
        System.out.println();

        //loop drawing "white/top" half of flag
        for (int i=0; i<size/2-2; i++) {
            System.out.print("║");
            for (int j=0; j<size*3-2; j++) {
                System.out.print(" ");
            }
            System.out.println("║");
        }

        //loop drawing "red/bottom" half of flag
        for (int i=0; i<size/2-2; i++) {
            System.out.print("║");
            for (int j=0; j<size*3-1; j++) {
                System.out.print("║");
            }
            System.out.println();
        }

        //loop drawing bottom edge of flag
        for (int i=0; i<size*3; i++) {
            System.out.print("═");
        }
        System.out.println();

    }

}