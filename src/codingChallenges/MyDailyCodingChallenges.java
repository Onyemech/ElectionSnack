package codingChallenges;

public class MyDailyCodingChallenges {

    public static int[] quicksort(int[] numbers, int start, int end) {
        if (start < end) {
            int partitionIndex = partion(numbers, start, end);
            quicksort(numbers, start, partitionIndex - 1);
            quicksort(numbers,  partitionIndex + 1, end);
        }
      
      return numbers;
    }

    private static int partion(int[] numbers, int start, int end) {
        //selecting a pivot
        int pivot = numbers[end];
        //starting at 0
        int currentIndex = 0;
        for (int index = 0; index < end; index++) {
            if (numbers[index] < pivot) {
                swap(numbers, currentIndex, index);
                currentIndex++;
            }

        }
        swap(numbers, currentIndex, end);
        return currentIndex;
    }

    private static void swap(int[] numbers, int currentIndex, int index) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[index];
        numbers[index] = temp;
    }
    public static int [] findMaxiMumProduct(int [] numbers) {
        quicksort(numbers,0, numbers.length-1);
        int firstElement = numbers[0];
        int secondElement = numbers[1];
        int secondToLastElement = numbers[numbers.length-2];
        int lastElement = numbers[numbers.length-1];
        if ((secondElement * firstElement) > (lastElement * secondElement))
            return new int[] {firstElement, secondElement};
        return  new int[]{secondElement, lastElement};
    }
}
