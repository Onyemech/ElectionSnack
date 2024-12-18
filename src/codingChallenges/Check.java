package codingChallenges;



public class Check {
    public static void main(String[] args) {

        String number = generateAccountNumber();
        String number2 = generateAccountNumber();
        String number3 = generateAccountNumber();
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);

    }
    public static String generateAccountNumber() {
       String number = "10";
       for (int count = 0; count < 8; count++) {
           int random = (int) (Math.random() * 10);
           number += random;
       }
       return number;
    }
}
