public class Main {
    static double balance;
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jhon Doe", 2384752, 0, "Checking");

        bankAccount.deposit(2000);
        balance = bankAccount.checkBalance();
        System.out.printf("Current balance: $%.2f%n", balance);
        bankAccount.withdraw(10);
        balance = bankAccount.checkBalance();
        System.out.printf("Current balance: $%.2f%n", balance);
        bankAccount.deactivateAccount();
        bankAccount.reactivateAccount();
    }
}