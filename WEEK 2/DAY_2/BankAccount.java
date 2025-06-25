public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }
        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
        }
    }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123456789", "Alice Smith", 1000.0);

        savings.displayAccountInfo();
        savings.deposit(500.0);
        savings.withdraw(200.0);

        System.out.println("Final Balance: " + savings.getBalance());
    }
}


