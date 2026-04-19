package classes_and_objects_inheritance_v2;

// Main class
public class BankAccount {
    public static void main(String[] args) {
    
        // Create objects from child class
        CreditAccount account1 = new CreditAccount("Joana", 5000, 20000);

        // Using method
        account1.getBalance(); // Method inheritance from father class -> Joana: 5000
        account1.getLimit(); // own child class -> Limit available: 20000

    }

}
