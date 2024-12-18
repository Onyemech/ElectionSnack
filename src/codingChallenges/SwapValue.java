package codingChallenges;

public class SwapValue {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println(number1+" "+number2);
    }
}
