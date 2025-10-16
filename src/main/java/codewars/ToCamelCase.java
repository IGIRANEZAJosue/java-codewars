/*
* Complete the method/function so that it converts dash/underscore delimited words into camel casing.
* The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
* The next words should be always capitalized.

Examples
    "the-stealth-warrior" gets converted to "theStealthWarrior"

    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

    "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
* */


package codewars;

import java.util.Arrays;

public class ToCamelCase {

    static String toCamelCase(String s){
        String[] words =  s.split("[-_]");

        return Arrays.stream(words, 1 , words.length)
                    .map(w -> w.substring(0,1).toUpperCase() + w.substring(1))
                    .reduce(words[0], String::concat);
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }
}
