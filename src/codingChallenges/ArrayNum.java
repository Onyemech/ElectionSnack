package codingChallenges;

public class ArrayNum {
    public static void main(String[] args) {
        int [] numbers = {4,5,8};
        int [] newNumbers = new int[6];
            for (int count = 0; count < numbers.length; count++){
                newNumbers[count] = numbers[count];
                newNumbers[count + numbers.length] = numbers[count] * 2;
            }
            for(int output = 0; output < newNumbers.length; output++) {
                System.out.print(newNumbers[output] + " ");
            }
    }
}
