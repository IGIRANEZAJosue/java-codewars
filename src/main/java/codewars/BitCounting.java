package codewars;

public class BitCounting {

    public static int countBits(int n){
        int count = 0;
        String binaryString = Integer.toString(n, 2);

        for (int i = 0; i < binaryString.length() ; i++) {
            if(binaryString.charAt(i) == '1') {
                count++;
            }
        }

        return count;
        // You can also use Integer.BitCount(n)
    }

    public static void main(String[] args) {
        System.out.println(countBits(120));
        System.out.println(countBits(1234));
    }
}
