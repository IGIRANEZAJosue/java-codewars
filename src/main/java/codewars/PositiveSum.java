package codewars;

public class PositiveSum {
    public static int sum(int[] arr){
        int sum = 0;
        for(int num: arr){
            if(num > 0){
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, -4, 7, 12}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{1,2,3,4,5}));
    }
}
