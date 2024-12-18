package codingChallenges;

public class Account {

    private String firstName;
    private String lastName;
    private String pin;
    private double balance;
    private String AccountNumber;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0.00;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    private String checkPinlength() {
        if(pin.length() != 4)
            throw new IllegalArgumentException("Invalid Pin Length Must Be Equal to 4");
        return pin;
    }

    private void setPin() {
        this.pin = checkPinlength();
    }

    public String getPin() {
        return pin;
    }

    private double validateAmount(double amount) {
        boolean amountGreaterThanZero = amount > 0;
        if (amountGreaterThanZero)
            return amount;
        else throw new IllegalArgumentException("invalid Amount");

    }



    public void deposit(double amount) {
        double checkValidAMount = validateAmount(amount);
        if(amount < 0) throw new IllegalArgumentException("amount cannot be less than zero");
        balance += checkValidAMount;
    }

    public void withdraw(double amount, String pin) {
        double checkValidAMount = validateAmount(amount);
        if(amount < 0) throw new IllegalArgumentException("amount cannot be less than zero");
        balance -= checkValidAMount;
    }

    private void changePin(String newPin) {
           this.pin = newPin;
    }

    public double getBalance(String pin) {
        checkForCorrectPin(pin);
        return balance;
    }

    private void checkForCorrectPin(String userPin) {
       if(!this.pin.equals(userPin)) throw new IllegalArgumentException("Invalid Pin Number");
    }

}
