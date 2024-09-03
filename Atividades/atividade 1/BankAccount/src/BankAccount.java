public class BankAccount {
    // Attributes of the bank account
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private String accountType; // Can be "Checking" or "Savings"
    private boolean isActive;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, int accountNumber, double initialBalance, String accountType) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.isActive = true;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (isActive && amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " was successful!");
        } else {
            System.out.println("Deposit failed. Please check if the account is active and the amount is positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (isActive && amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " was successful!");
        } else {
            System.out.println("Withdrawal failed. Please check the balance, if the account is active, and the amount is positive.");
        }
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }

    // Method to deactivate the account
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Account successfully deactivated.");
    }

    // Method to reactivate the account
    public void reactivateAccount() {
        isActive = true;
        System.out.println("Account successfully reactivated.");
    }
}
