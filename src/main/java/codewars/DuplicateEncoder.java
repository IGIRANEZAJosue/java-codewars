/*
* The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
* */

package codewars;

public class DuplicateEncoder {

    static String encode(String word){
        StringBuilder result = new StringBuilder();
        String lowerString = word.toLowerCase();

        for(String letter : lowerString.split("")){
            if(lowerString.indexOf(letter) == lowerString.lastIndexOf(letter)){
                result.append("(");
            } else {
                result.append(")");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("hello"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
    }
}
