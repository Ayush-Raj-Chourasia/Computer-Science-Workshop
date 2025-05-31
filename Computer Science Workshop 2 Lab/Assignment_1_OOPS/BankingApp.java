abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        super.deposit(amount + interest);
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("S123", 1000, 5);
        Account current = new CurrentAccount("C123", 500, 200);

        savings.deposit(200);
        savings.withdraw(50);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        current.deposit(300);
        current.withdraw(600);
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
