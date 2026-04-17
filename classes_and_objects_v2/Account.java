package classes_and_objects_v2;
public class Account {
    
    // Identifiers
    public String titular;
    public double balance;

    // Constructors
    public Account(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    // Method with no return
    public void seeBalance() {
        System.out.println(titular + " have: " + balance + " CVE");
    }
}
