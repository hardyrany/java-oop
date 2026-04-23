package classes_and_objects_polymorphism_v3;

// Parent class
public class Account {

    // Attributes
    String titular;
    double balance;

    // Constructor
    public Account(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    /*
     * Methods with return value
     * Getters and Setters
     * No parameters
     */

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    // Method with return value
    public double calculateFees() {
        System.out.println("Account fees: 2%");
        return balance * 0.02;
    }

}
