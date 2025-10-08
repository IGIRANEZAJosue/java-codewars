/*
* You need to write a function, that returns the first non-repeated character in the given string.

If all the characters are unique, return the first character of the string.
If there is no unique character, return null in JS or Java, None in Python, '\0' in C.

You can assume, that the input string has always non-zero length.

    Examples
    "test"   returns "e"
    "teeter" returns "r"
    "trend"  returns "t" (all the characters are unique)
    "aabbcc" returns null (all the characters are repeated)
* */

package codewars;

public class FirstNonRepeated {

    public static Character firstNonRepeated(String source) {
        for(char c : source.toCharArray()){
            if(source.indexOf(c) == source.lastIndexOf(c)) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("test"));
        System.out.println(firstNonRepeated("teeter"));
        System.out.println(firstNonRepeated("trend"));
        System.out.println(firstNonRepeated("aabbcc"));
    }
}
