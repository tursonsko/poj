import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

/*
https://www.codingame.com/ide/puzzle/power-of-thor-episode-1
This is solution of game "Power of Thor Episode 1"
Author: Wojtek
 */
class Codingame2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position


        int thorX = initialTx;
        int thorY = initialTy;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
            // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            String thorDirectionX = "";
            String thorDirectionY = "";
            if (thorX < lightX) {
                thorDirectionX = "E";
                thorX++;
            } else if (thorX > lightX) {
                thorDirectionX = "W";
                thorX--;
            }

            if (thorY < lightY) {
                thorDirectionY = "S";
                thorY++;
            } else if (thorY > lightY) {
                thorDirectionY = "N";
                thorY--;
            }




            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(thorDirectionY + thorDirectionX);
            //System.out.println(initialTx + "|" + initialTy);
        }
    }
}