package codewars;

public class Vowels {

    public static int getCount(String str) {
        int count = 0;
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("hello"));
        System.out.println(getCount("aeoui"));
        System.out.println(getCount("hello world"));
    }
}
