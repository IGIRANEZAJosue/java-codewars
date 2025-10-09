package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        String lowerCaseText = text.toLowerCase();
        return Arrays.stream(lowerCaseText.split(""))
                    .filter(letter -> lowerCaseText.indexOf(letter) != lowerCaseText.lastIndexOf(letter))
                    .collect(Collectors.toSet())
                    .size();
    }


    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("JqFLLLLwJAkzxXKFZzXZTQjF"));
    }
}
