package codingChallenges;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int counter;
    private String number;

    public Bank() {
        this.counter = 0;
        this.accounts = new ArrayList<>();
        this.number = "";
    }

    public String getNumber() {
        return number;
    }

    public int getTotalCounter() {
        return counter;
    }

    public Account createAccount(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin);
        accounts.add(account);
        this.counter++;
        return account;
    }

private void validation(int number, double amount) {
    validateAmount(amount);
    validateAmount(number);
}

    public void validateAmount(double amount) {
        boolean amountIsNotValid = amount < 1;
        if (amountIsNotValid) throw new IllegalArgumentException("invalid amount");
    }

    private void checkAcctExists(int number) {
        boolean accountNotInExistence = number <= 0 || number > accounts.size();
        if(accountNotInExistence) {throw new IllegalArgumentException("Account not found");}
    }

    public void validateAccounts (int sender, int receiver) {
        if(sender == receiver) throw new IllegalArgumentException("You cannot transfer to yourself");
    }


    public Account findAccount(int number) {
            checkAcctExists(number);
            return accounts.get(number-1);
    }


    public String getAccountName(int number, double amount) {
        validation(number, amount);
        return accounts.get(number-1).getFullName();
    }

    public void deposit(int accountNumber, int amount){
        validation(accountNumber,amount);
        findAccount(accountNumber).deposit(amount);
    }

    public void withdrawFrom(int accountNumber, int amount,String givenPin) {
        validation(accountNumber,amount);
        findAccount(accountNumber).withdraw(amount, givenPin);
    }

    public void transfer(int sender, int receiver, double amount, String sendersPin) {
        validateAccounts(sender, receiver);
        Account senderAccount = findAccount(sender);
        Account receiverAccount = findAccount(receiver);

        senderAccount.withdraw(amount,sendersPin);
        receiverAccount.deposit(amount);
    }



    public double getBalance(int number, String pin) {
        return findAccount(number).getBalance(pin);
    }


    public void deleteAccount(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin);
        accounts.remove(account);
        this.counter--;
    }

    public static String generateAcctNumber() {
        String number = "10";
        for (int count = 0; count < 8; count++) {
            int random = (int) (Math.random() * 10);
            number += random;
        }
        return number;
    }

}

