//package codingChallenges;
//import java.util.Scanner;
//import javax.swing.*;
//
//import static jdk.internal.org.jline.keymap.KeyMap.display;
//
//public class ATMachine {
//    Bank kuda = new Bank();
//    public static void main(String[] args) {
//        ATMachine atm = new ATMachine();
//        atm.mainMenu();
//    }
//    public void mainMenu(){
//        String menu = """
//                Welcome to the AT Machine.
//                Please select an option:
//                1. Create Account
//                2. Deposit
//                3. Withdraw
//                4. Transfer
//                5. Check Balance
//                6. Logout
//                """;
//        System.out.println(menu);
//        String userInput = "";
//
//        switch(userInput){
//            case "1" -> createAccount();
//            case "2" -> depositMoney();
//            case "3" -> withdrawMoney();
//            case "4" -> transferMoney();
//            case "5" -> checkBalance();
//            case "6" -> logOut();
//            default -> System.out.println("Invalid input\nThe option provided is only from (1 - 6)");
//
//        }
//    }
//    private void createAccount() {
//        String firstName = input("Input your First name");
//        String lastName = input("Input your last name");
//        String pin = input("Input your pin");
//        kuda.createAccount(firstName, lastName, pin);
//        display("Account Created for account %d", kuda.getTotalCounter());
//        mainMenu();
//    }
//
//    private void depositMoney() {
//        try {
//            int accountNumber = inputInt("Input your Account number");
//            int amount = inputInt("input the amount you want to send ");
//            String pin = input("Input your PIN");
//            kuda.deposit(accountNumber, amount);
//            display("Your Account Balance: %f", kuda.getBalance(accountNumber, pin));
//        }catch(IllegalArgumentException error){
//            display(error.getMessage());
//        }finally {
//            mainMenu();
//        }
//    }
//
//    private void withdrawMoney() {
//        try {
//            int accountNumber = inputInt("Input your Account number");
//            int amount = inputInt("input the amount you want to send ");
//            String pin = input("input your pin");
//            kuda.withdrawFrom(accountNumber, amount, pin);
//            display("Your Account Balance: %f", kuda.getBalance(accountNumber, pin));
//        }catch(IllegalArgumentException error){
//            display(error.getMessage());
//        }finally {
//            mainMenu();
//        }
//    }
//
//    private void transferMoney() {
//        try {
//            int sender = inputInt("Input your account number");
//            int receiver = inputInt("input your receiver account");
//            int amount = inputInt("input the amount");
//            String inputtedPin = input("input your pin");
//            wema.transfer(sender, receiver, amount, inputtedPin);
//            display("Your Account Balance: %f", wema.getBalance(sender,inputtedPin));
//
//        }catch(IllegalArgumentException error) {
//            display(error.getMessage());
//        }finally {
//            mainMenu();
//        }
//    }
//
//    private void checkBalance() {
//        try {
//            int user = inputInt("Input your account number");
//            String pin = input("Input your PIN");
//            display("Account Balance: %f",Kuda.getBalance(user,pin));
//        }catch(IllegalArgumentException error) {
//            display(error.getMessage());
//        }finally {
//            mainMenu();
//        }
//    }
//
//    private void logOut() {
//        display("Thank you for banking with us ");
//        System.exit(49);
//    }
//
//
//
//
//}
