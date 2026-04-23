package classes_and_objects_polymorphism_v2;

// Main class
public class BankAccount {
    public static void main(String[] args) {

        /*
         * Create a new object from parent class
         * Applying in child class mode
         */

        Account account1 = new Account();
        Account account2 = new SavingAccount();
        Account account3 = new CreditAccount();

        account1.calculateFees();
        account2.calculateFees();
        account3.calculateFees();

    }
}
