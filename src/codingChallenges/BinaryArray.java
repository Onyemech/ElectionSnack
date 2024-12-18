package codingChallenges;

public class BinaryArray {
    public static int[] getBinaryNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] % 2;
        }
        return numbers;
    }
}
