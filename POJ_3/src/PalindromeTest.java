/** PALINDROME TEST CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class PalindromeTest {

    public static void main(String[] args) {

        String x = "Muzo, raz;... daj ...jad;;;; za      rozum.";
        String y = "Atak;;;;;..... kata";
        String z = "Wódy ; ; ; ;.,,,, żal dla ....,,,Żydów";
        String a = "Wo,;jt,ek Tur,ek kerUt KetJo.....W";

        System.out.println(Palindrome.palindromeChecker(x));
        System.out.println(Palindrome.palindromeChecker(y));
        System.out.println(Palindrome.palindromeChecker(z));
        System.out.println(Palindrome.palindromeChecker(a));
    }

}
