package entities;

public class Account {
    private String name;
    private int accountNumber;
    private double initialDeposit;

    public Account(String name, int accountNumber, double initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
    }

    public Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }
  
    public void deposit(double value) {
        this.initialDeposit += value;
    }

    public double withdraw(double withdraw) {
        return this.initialDeposit -= (withdraw + 5);
    }

    public double getTotalAmount() {
        return this.initialDeposit;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber +
                ", Holder: " + name +
                ", Balance: $" + getTotalAmount();
    }
}