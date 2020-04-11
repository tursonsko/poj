/**
 * Chuck Norris Exercise Implmentation
 * https://www.codingame.com/ide/puzzle/chuck-norris
 * Author: Wojtek Turek
 */


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String binaryMessage = "";
        String MESSAGE = in.nextLine();

        for(int i =0; i < MESSAGE.length(); i++) {

            String binaryChar = Integer.toBinaryString((int)MESSAGE.charAt(i));
            binaryChar = "0000000".substring(binaryChar.length()) + binaryChar;
            binaryMessage += binaryChar;

        }

        char lastChar = ' ';
        String newMessage = "";
        String[] bits = new String[] { " 00 0", " 0 0" };

        for (int i = 0; i < binaryMessage.length(); i++)
        {
            if (binaryMessage.charAt(i) != lastChar)
            {
                lastChar = binaryMessage.charAt(i);
                newMessage += bits[lastChar - '0'];
            }
            else
            {
                newMessage += "0";
            }
        }

        System.out.println(newMessage.substring(1));
    }
}