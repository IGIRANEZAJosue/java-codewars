/*
*
* This time no story, no theory. The examples below show you how to write function accum:
*
* Examples:
* accum("abcd") -> "A-Bb-Ccc-Dddd"
* accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
* accum("cwAt") -> "C-Ww-Aaa-Tttt"
*
* The parameter of accum is a string which includes only letters from a..z and A..Z.
* */

package codewars;

public class Accumul {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            result.append(Character.toUpperCase(letter));

            result.append(String.valueOf(Character.toLowerCase(letter)).repeat(i));

            if (i < s.length() - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }
}
