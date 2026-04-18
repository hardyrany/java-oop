package classes_and_objects_encapsulated;

/* Encapsulation
   Hide the internal data with private, and expose it only through controlled getters and setters.
*/

// Class
class Account {

    // Identifier
    // Nobody access directly
    private String titular;
    private double balance;

    // Constructor
    public Account(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    // Getter
    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    // Setter with validation - total control about data
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
    }

}

public class AccountEncapsulate {
    public static void main(String[] args) {

        // Create objects
        Account account1 = new Account("Duy", 20000);
        Account account2 = new Account("Rany", 50000);

        System.out.println(account1.getTitular() + ": " + account1.getBalance() + " CVE");
        System.out.println(account2.getTitular() + ": " + account2.getBalance() + " CVE");
    }
}
