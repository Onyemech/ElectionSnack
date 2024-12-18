package codingChallenges;

public class CeaserCipher {


    public String encrypt(String word, int key) {
        String encrypted = "";
        char[] chars = word.toCharArray();
        for (char c : chars) {
            c += key;
            encrypted += c;
        }
        return encrypted;
    }

    public String decrypt(String word, int key) {
        String decrypted = "";
        char[] chars = word.toCharArray();
        for (char c : chars) {
            c -= key;
            decrypted += c;
        }
        return decrypted;
    }

    public void checkForNumbers(String word) {
        if (word.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Text or word contains a digit");
        }
    }

    public void checkForValidKeyOrNumbers(int key) {
        boolean validNumber = key < 1 || key > 26;
        if (validNumber) {
            throw new IllegalArgumentException("numbers must fall from the range of 1-26");
        }
    }
}
