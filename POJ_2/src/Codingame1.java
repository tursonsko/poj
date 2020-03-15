import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * https://www.codingame.com/ide/puzzle/horse-racing-duals
 **/

/*
/This is solution of game "Horse racing duals"
Author: Wojtek
 */
class Codingame1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] pi = new int[N];
        int difference = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            pi[i] = in.nextInt();
        }

        Arrays.sort(pi);

        for (int i = 0; i < N-1; i++) {
            if (pi[i+1] - pi[i] < difference) {
                difference = pi[i+1] - pi[i];
            }

        }

        System.out.println(difference);



        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}