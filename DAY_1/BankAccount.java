public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi Kumar", "ACC123456", 10000.0);
        acc1.displayBalance();
        acc1.deposit(2000.0);
        acc1.withdraw(1500.0);
        acc1.withdraw(20000.0);
        acc1.displayBalance();
    }
}
