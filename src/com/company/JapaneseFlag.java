/* This is program which shows imitation of Japanese flag in three sizes
Poor code, friend from gruop helped me to understand logic, but i can not present same or similar code, so just poor solution
 * Author: Wojtek
 * */

package com.company;

import java.util.Scanner;

public class JapaneseFlag {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the Polish flag imitation that the program will draw for You");
        System.out.println("[1] - SMALL\n[2] - MEDIUM\n[3] - LARGE");

        int size = scan.nextInt();

        //driver menu, necessity to choose one of three sizes of flag
        switch (size) {
            case 1:
                japaneseFlagSmall();
                break;
            case 2:
                japaneseFlagMedium();
                break;
            case 3:
                japaneseFlagLarge();
                break;
            default:
                System.out.println("Invalid value specified");
                break;
        }

    }

    public static void japaneseFlagSmall() {
        System.out.println(" ═════════════════════════════════════");
        System.out.println("║                                     ║");
        System.out.println("║                *****                ║");
        System.out.println("║              *********              ║");
        System.out.println("║              *********              ║");
        System.out.println("║                *****                ║");
        System.out.println("║                                     ║");
        System.out.println(" ═════════════════════════════════════");

    }

    public static void japaneseFlagMedium() {
        System.out.println(" ══════════════════════════════════════════════════");
        System.out.println("║                                                  ║");
        System.out.println("║                                                  ║");
        System.out.println("║                                                  ║");
        System.out.println("║                      ******                      ║");
        System.out.println("║                   ************                   ║");
        System.out.println("║                  **************                  ║");
        System.out.println("║                   ************                   ║");
        System.out.println("║                     ********                     ║");
        System.out.println("║                                                  ║");
        System.out.println("║                                                  ║");
        System.out.println("║                                                  ║");
        System.out.println(" ══════════════════════════════════════════════════");

    }

    public static void japaneseFlagLarge() {
        System.out.println(" ═══════════════════════════════════════════════════════════════════════");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                              ***********                              ║");
        System.out.println("║                           *****************                           ║");
        System.out.println("║                         *********************                         ║");
        System.out.println("║                         *********************                         ║");
        System.out.println("║                         *********************                         ║");
        System.out.println("║                           *****************                           ║");
        System.out.println("║                              ***********                              ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println("║                                                                       ║");
        System.out.println(" ═══════════════════════════════════════════════════════════════════════");




    }


}
