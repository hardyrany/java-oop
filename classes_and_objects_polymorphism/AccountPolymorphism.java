package classes_and_objects_polymorphism;

/* Polymorphism
   The same method behaves differently depending on the object.
*/

// Parent class
class Account {

    // Public method with return value
    public void calculateFees() {
        System.out.println("Default fees: 2%");
    }
}

// Child class 1 - rewrite method (Method Overriding)
class SavingAccount extends Account {

    // Method Overriding - rewrite method with is own
    @Override
    public void calculateFees() {
        System.out.println("Saving fees: 5%");
    }
}

// Child class 2 - rewrite method (Method Overriding)
class CreditAccount extends Account {

    // Method Overriding - rewrite method with is own
    @Override
    public void calculateFees() {
        System.out.println("Credit fees: 18%");
    }
}

public class AccountPolymorphism {
    public static void main(String[] args) {

        /*
         * Create a new object from Parent class, with,
         * Polymorphism, in action - same type, different behavior
         */

        Account account1 = new Account();
        Account account3 = new SavingAccount(); // upcasting
        Account account2 = new CreditAccount();

        account1.calculateFees();
        account2.calculateFees();
        account3.calculateFees();
    }
}
