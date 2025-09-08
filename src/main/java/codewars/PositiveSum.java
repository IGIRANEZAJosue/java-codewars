package codewars;

import java.util.Arrays;

public class PositiveSum {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, -4, 7, 12}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{1,2,3,4,5}));
    }
}
