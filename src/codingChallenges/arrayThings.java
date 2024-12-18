package codingChallenges;


import java.util.stream.IntStream;

public class arrayThings {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        IntStream stream = IntStream.range(0, arr.length)
                .flatMap(i -> IntStream.of(arr[i], arr2[i]));

        stream.forEach(System.out::print);
    }
}
