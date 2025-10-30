/*
 *  Write a program that accepts an array of strings and a HashMap that represents a dictionary.
 * The program must replace each element in the array with the corresponding value from the dictionary, if it exists. If an element doesn't exist in the dictionary, it must be left unchanged. The program must print out the modified array.

Sample Input 1:
5
dog cat bird dog bird
2
dog canine cat feline


Sample Output 1:

canine feline bird canine bird
 *
 * */

package hyperskill;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise1 {
    private static void printReplacedString(HashMap<String, String> map, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                array[i] = map.get(array[i]);
            }
        }
        System.out.println(String.join(" ", array));
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.next();
        }
        int m = scanner.nextInt();

        for (int i = 0; i < m; ++i) {
            map.put(scanner.next(), scanner.next());
        }

        printReplacedString(map, array);
    }

}
