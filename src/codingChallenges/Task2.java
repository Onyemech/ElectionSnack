package codingChallenges;

public class Task2 {
    public static void main(String[] args) {
        String [] letters = {"a","b","c",
                "d","e","f",
                "g","h","i" };
        for(int count = 0; count < 3; count++) {
            for(int counter = 0; counter < letters.length; counter++) {
                System.out.print(letters[counter] + " ");
            }
            System.out.println("");
        }
    }
}

