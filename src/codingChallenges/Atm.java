package codingChallenges;

import javax.swing.*;

public class Atm {

    Bank wema = new Bank();
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.mainMenu();

    }

    public void mainMenu(){

        String menu =
                """
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance	    
                6. Logout
                
                """;
        display(menu);
        String userChoice = input("input your choice");

        switch(userChoice){
            case "1" -> createAccount();
            case "2" -> depositMoney();
            case "3" -> withdrawMoney();
            case "4" -> transferMoney();
            case "5" -> checkBalance();
            case "6" -> logout();
        }
    }

    private void createAccount() {

        String firstName = input("Input your First name");
        String lastName = input("Input your last name");
        String pin = input("Input your pin");
        wema.createAccount(firstName, lastName, pin);
        display("Account Created for account %d", wema.getTotalCounter());
        mainMenu();
    }


    private void depositMoney() {
        try {
            int accountNumber = inputInt("Input your Account number");
            int amount = inputInt("input the amount you want to send ");
            String pin = input("Input your PIN");
            wema.deposit(accountNumber, amount);
            display("Your Account Balance: %f", wema.getBalance(accountNumber, pin));
        }catch(IllegalArgumentException error){
            display(error.getMessage());
        }finally {
            mainMenu();
        }
    }


    private void withdrawMoney() {

        try {
            int accountNumber = inputInt("Input your Account number");
            int amount = inputInt("input the amount you want to send ");
            String pin = input("input your pin");
            wema.withdrawFrom(accountNumber, amount, pin);
            display("Your Account Balance: %f", wema.getBalance(accountNumber, pin));
        }catch(IllegalArgumentException error){
            display(error.getMessage());
        }finally {
            mainMenu();
        }
    }


    private void transferMoney() {
        try {
            int sender = inputInt("Input your account number");
            int receiver = inputInt("input your receiver account");
            int amount = inputInt("input the amount");
            String inputtedPin = input("input your pin");
            wema.transfer(sender, receiver, amount, inputtedPin);
            display("Your Account Balance: %f", wema.getBalance(sender,inputtedPin));

        }catch(IllegalArgumentException error) {
            display(error.getMessage());
        }finally {
            mainMenu();
        }

    }


    private void checkBalance() {
        try {
            int user = inputInt("Input your account number");
            String pin = input("Input your PIN");
            display("Account Balance: %f",wema.getBalance(user,pin));
        }catch(IllegalArgumentException error) {
            display(error.getMessage());
        }finally {
            mainMenu();
        }
    }

    private void logout() {
        display("Thank you for banking with us ");
        System.exit(49);
    }

    private void showMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private int inputInt(String prompt){
        String input = JOptionPane.showInputDialog(prompt);
        return Integer.parseInt(input);
    }
    private String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private void display(String prompt){
        showMessage(prompt, "Information");
    }
    private void display(String prompt, double value){
        showMessage(String.format(prompt, value), "Information");
    }

    private void display(String prompt,int value){
        showMessage(String.format(prompt, value), "Information");
    }

}



