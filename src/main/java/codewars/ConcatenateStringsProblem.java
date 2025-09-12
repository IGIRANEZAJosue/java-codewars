package codewars;

import java.util.Scanner;

public class ConcatenateStringsProblem {
    // This is an exercise from Hyperskill on StringBuilder;

    public static String concatenateStringsWithoutDigits(String[] strings) {
        String digits = "0123456789";
        StringBuilder result = new StringBuilder();


        for(String word : strings) {
            for(String letter : word.split("")) {
                if(!digits.contains(letter)){
                    result.append(letter);
                }
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
