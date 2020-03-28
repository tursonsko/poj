
/** PALINDROME CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class Palindrome {

    public static boolean palindromeChecker(String sentence) {

        String clearSentence = sentence.replaceAll("[.,;\\s]", "").toLowerCase();
        int i = 0;
        int j = clearSentence.length()-1;

        while (i < j) {
            if(clearSentence.charAt(i) == clearSentence.charAt(j))
                return true;
            i++;
            j--;

        }
        return false;
    }

}
