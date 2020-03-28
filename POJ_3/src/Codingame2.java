/*
/Codingame Temperatures (https://www.codingame.com/ide/puzzle/temperatures) implementation
Author: Wojtek Turek
 */

import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.Math.abs;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] tempArr = new int[n];

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            tempArr[i] = t;
        }

        if (tempArr.length == 0) {
            System.out.println("0");
        } else {

            int closestIndex = 0;
            int difference = Integer.MAX_VALUE;
            for (int i = 0; i < tempArr.length; i++) {
                int absValue = abs(tempArr[i]);
                if(absValue < difference) {
                    difference = absValue;
                    closestIndex = i;
                } else if(absValue == difference && tempArr[i] > 0 && tempArr[closestIndex] < 0 ) {
                    closestIndex = i;
                }

            }
            System.out.println(tempArr[closestIndex]);

        }
    }
}
