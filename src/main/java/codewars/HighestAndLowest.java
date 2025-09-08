package codewars;

import java.util.Arrays;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] numArr = numbers.split(" ");
        int[] nums = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            nums[i] = Integer.parseInt(numArr[i]);
        }
        Arrays.sort(nums);

        return (nums[numArr.length - 1] + " " + nums[0]);
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
    }
}
