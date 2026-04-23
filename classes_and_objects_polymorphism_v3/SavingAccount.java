package classes_and_objects_polymorphism_v3;

// Child class 1
public class SavingAccount extends Account {
    
    // Attributes

    // Constructor
    public SavingAccount(String titular, double balance) {
        super(titular, balance);
    }

    // Methods with return type and value
    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    // Method with overriding
    @Override
    public double calculateFees() {
        System.out.println("Saving fees: 5%");
        return getBalance() * 0.05;
    }
}
