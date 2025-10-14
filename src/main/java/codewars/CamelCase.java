/*
* Write a method (or function, depending on the language) that converts a string to camelCase,
* that is, all words must have their first letter capitalized and spaces must be removed.

Examples (input --> output):
    "hello case" --> "HelloCase"
    "camel case word" --> "CamelCaseWord"

Don't forget to rate this kata! Thanks :)
* */

package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

    public static String toCamelCase(String str) {
        return Arrays.stream(str.split(" "))
                    .filter(w -> !w.isBlank())
                    .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                    .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("hello world"));
        System.out.println(toCamelCase("camel case word"));
        System.out.println(toCamelCase(""));
        System.out.println(toCamelCase("hello  this is camel  case"));
    }
}
