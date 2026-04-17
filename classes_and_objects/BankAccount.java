package classes_and_objects;

// A class is the blueprint. An object is the instance created from that blueprint.

// Class
class Account {

    // Instance variables
    String titular;
    double balance;

    // Constructor
    public Account(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    // Method
    public void getBalance() {
        System.out.println(titular + " have: " + balance + " CVE");
    }
}

public class BankAccount {
    public static void main(String[] args) {

        // Create objects
        Account account1 = new Account("Hardy", 50000);
        Account account2 = new Account("Merly", 12000);

        account1.getBalance();
        account2.getBalance();

    }

}
