package classes_and_objects_inheritance_v2;

// Father class
public class Account {

    // Attributes - Protected
    protected String titular;
    protected double balance;

    // Constructor
    public Account(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    // Method without return value
    public void getBalance() {
        System.out.println(titular + ": " + balance + " CVE");
    }

}
