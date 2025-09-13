package codewars;

public class SpinWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }
}
