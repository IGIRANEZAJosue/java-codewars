package codewars;

public class SumNumber {

    public static int sumDigits(int number){
        if(number < 0) number = -number;

        String[] digits = String.valueOf(number).split("");
        int sum = 0;

        for(String digit : digits){
            sum += Integer.parseInt(digit);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(25));
        System.out.println(sumDigits(-32));
    }
}
