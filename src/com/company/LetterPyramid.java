/* This is a program, which allows user to generate symmetrical alphabet ("a"-"z") pyramid.
 * Just follow instruction and enjoy!
 * Author: Wojtek
 * */

package com.company;

import java.util.Scanner;

public class LetterPyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //char is represented in ascii table with number, so letter behave like integer value
        char letter = 97;

        System.out.println("Enter size of letter pyramid (min 1, max 26)");
        int size = scan.nextInt();
        //validation values
        if (size<=0 || size>26) {
            System.out.println("Wrong size!");
        } else {

            for(int i=0; i<size; i++) { //main loop, it is resposnible for size of pyramid

                for(int j=size; j>i; j--) { // makes top of pyramid
                    System.out.print(" ");
                }

                for(int k=0; k<=i; k++) { // makes left part of pyramid
                    System.out.print(letter++);
                }
                letter--;

                for(int l=1; l<=i; l++) { //makes right part of pyramid
                    System.out.print(--letter);
                }

                System.out.println();
                letter = 97;

            }

        }

    }
}
//abcdefghijklmnopqrstuvwxyz-26