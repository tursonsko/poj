/**
 * Different Words program implementation (Exercise 25)
 * Author Wojtek Turek
 */

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class DifferentWords {
    public static void main(String[]args) throws Exception {

        File file = new File("src/words.txt");

        Scanner textFile = new Scanner(new File(String.valueOf(file)));

        TreeSet<String> wordsList = new TreeSet<>();

        while (textFile.hasNext()) {
            wordsList.add(textFile.next().trim().toLowerCase().replaceAll("[.,\\s]", ""));
        }

        System.out.println("\n" + wordsList.toString().replaceAll("[\\[\\].,]", ""));
        System.out.println("\nNumber of words: " + wordsList.size());
    }
}
