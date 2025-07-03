import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Account> accounts;

    Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(this, customer, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.name + " at " + bankName);
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.bankName + ", Balance: " + acc.balance);
        }
    }
}

class Account {
    Bank bank;
    Customer customer;
    double balance;

    Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }
}

public class BankAndAccount {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("National Bank");

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank1.openAccount(cust1, 1000);
        bank2.openAccount(cust1, 5000);
        bank1.openAccount(cust2, 3000);

        cust1.viewBalance();
        System.out.println();
        cust2.viewBalance();
    }
}
