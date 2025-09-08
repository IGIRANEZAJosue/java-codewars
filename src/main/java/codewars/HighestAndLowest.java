package codewars;

import java.util.Arrays;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] numArr = numbers.split(" ");
        Arrays.sort(numArr);
        return (numArr[numArr.length - 1] + " " + numArr[0]);
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
    }
}
