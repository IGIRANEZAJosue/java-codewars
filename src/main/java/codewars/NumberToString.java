package codewars;

public class NumberToString {

    public static String numberToString(int num) {
        return Integer.toString(num);
        // You can also use String.valueOf(num) or just string concatenation.
    }

    public static void main(String[] args) {
        System.out.println(numberToString(999));
        System.out.println(numberToString(123));
        System.out.println(numberToString(-100));
    }
}
