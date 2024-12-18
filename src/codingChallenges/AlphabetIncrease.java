package codingChallenges;

import java.util.Scanner;

public class AlphabetIncrease {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inputStr, int shiftKey){
        inputStr = inputStr.toLowerCase();
        String encryptString = "";

        for(int i = 0; i < inputStr.length(); i++){
            int position = alphabet.indexOf(inputStr.charAt(i));
            int encryotPosition = (shiftKey + position) % alphabet.length();
            char encryotChar = alphabet.charAt(encryotPosition);
            encryptString += encryotChar;
        }
        return encryptString;
    }
    public static String decryptData(String inputStr, int shiftKey){
        inputStr = inputStr.toLowerCase();
        String decryptString = "";
        for(int i = 0; i < inputStr.length(); i++){
            int position = alphabet.indexOf(inputStr.charAt(i));
            int decrytPosition = (shiftKey - position) % alphabet.length();
            char decryChar = alphabet.charAt(decrytPosition);
            decryptString += decryChar;
        }
        return decryptString;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputStr = input.nextLine();
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.valueOf(input.nextLine());
        System.out.println("Encrypted Data ===> "+encryptData(inputStr, shiftKey));
        System.out.println("Decrypted Data ===> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));
    }
}
