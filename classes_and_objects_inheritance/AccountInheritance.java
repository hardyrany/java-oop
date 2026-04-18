package classes_and_objects_inheritance;

/* Inheritance: 
   A child class inherits everything from the parent class and can add its own behavior.
 */

// Father class
class Account {

    // Attributes
    protected String titular;
    protected double balance;

    // Constructor
    public Account(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    // Method
    public void getBalance() {
        System.out.println(titular + ": " + balance + " CVE");
    }
}

// Child class - inheritance have thing from Account and add limit
class CreditAccount extends Account {

    // Attributes
    private double limit;

    // Constructor
    public CreditAccount(String titular, double balance, double limit) {
        super(titular, balance); // Call constructor from father class
        this.limit = limit;
    }

    // Method
    public void getLimit() {
        System.out.println("Limit available: " + limit + " CVE");
    }
}

public class AccountInheritance {
    public static void main(String[] args) {

        // Create object from child class
        CreditAccount creditaccount1 = new CreditAccount("Maria", 3000, 10000);

        creditaccount1.getBalance(); // inheritance from father class -> Maria: 3000.0 CVE
        creditaccount1.getLimit(); // own child class -> Limit available: 10000.0 CVE
    }

}
