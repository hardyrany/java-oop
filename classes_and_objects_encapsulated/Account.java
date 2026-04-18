package classes_and_objects_encapsulated;

// Class
public class Account {

    // Identifiers / Attributes
    private String titular;
    private double balance;

    // Constructor with parameters
    public Account(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    // Method with return value - getters and setters

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    // Setters - with validation - total control about data
    public void deposit(double value) {
        if (value <= 0) {
            System.out.println("Invalid value!");
            return;
        }
        balance += value;
        System.out.println("Deposit:" + value + " CVE");
    }

    public void withdraw(double value) {
        if (value > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= value;
        System.out.println("Withdraw: " + value + " CVE");
    }
}
