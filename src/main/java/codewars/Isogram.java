/*
* An isogram is a word that has no repeating letters, consecutive or non-consecutive.
* Implement a function that determines whether a string that contains only letters is an isogram.
* Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)
    "Dermatoglyphics" --> true
    "aba" --> false
    "moOse" --> false (ignore letter case)
* */

package codewars;

public class Isogram {

    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }
}
