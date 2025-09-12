package codewars;

import java.util.Arrays;

public class FindOdd {

    public static int findIt(int[] a) {
        for(int num: a){
            int occurrence = Arrays.stream(a).filter(v -> v == num).toArray().length;
            if(occurrence % 2 != 0) {
                return num;
            }
        }

        return a[0];
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }
}
