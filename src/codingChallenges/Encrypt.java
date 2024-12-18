package codingChallenges;

public class Encrypt {
    public static void main(String[] args) {
        String text = "boy";
        String newWord = "";

        char [] chars = text.toCharArray();
        for (char ch : chars) {
            ch += 1;
            newWord += ch;
        }
        System.out.println(newWord);

    }


}
