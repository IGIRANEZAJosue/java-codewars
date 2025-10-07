/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
        16  -->  1 + 6 = 7
       942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
* */

package codewars;

public class DRoot {

    public static int digital_root(int n) {
        if(n == 0) return 0;

        // The mathematical formula for calculating the digital root of a number is n % 9;
        // but here we're adding 1 in order to handle cases of 9, 19, 27,etc.. where n % 9 might be zero.
        return 1 + (n - 1) % 9;

    }

    public static void main(String[] args) {
        System.out.println(digital_root(15));
        System.out.println(digital_root(456));
        System.out.println(digital_root(493193));
    }
}
