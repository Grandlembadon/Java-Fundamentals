package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = scan.next();
        String vowels = "aeiou";
        int i = 0;
        while (i < word.length()) {
            int j = 0;
            while (j < vowels.length()) {
                if (vowels.charAt(j) == word.charAt(i)) {
                    i++;
                    j++;
                }
                System.out.println(word + word.charAt(i));

            }
        }
    }
}





