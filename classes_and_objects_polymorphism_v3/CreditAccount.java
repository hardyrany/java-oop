package classes_and_objects_polymorphism_v3;


public class CreditAccount extends Account {
    
    // Attributes / Identifiers

    // Constructor
    public CreditAccount(String titular, double balance){
        super(titular, balance);
    }

    // Method with return type and value
    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    // Method with overriding
    @Override
    public double calculateFees() {
        System.out.println("Credit fees: 18%");
        return getBalance() * 0.18;
    }
}
