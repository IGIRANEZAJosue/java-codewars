/*
* A pangram is a sentence that contains every single letter of the alphabet at least once.
* For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
*
* Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
* */

package codewars;

import java.util.Arrays;

public class PangramChecker {

    public static boolean check(String sentence){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int letterCount = Arrays.stream(sentence.toLowerCase().split(""))
                                .filter(alphabets::contains)
                                .distinct()
                                .toList()
                                .size();

        return letterCount == 26;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }
}
