package classes_and_objects_inheritance_v2;

// Child class
public class CreditAccount extends Account {

    // Attributes - private
    private double limit;

    // Constructor
    public CreditAccount(String titular, double balance, double limit) {
        super(titular, balance); // Attributes from father class - use super for calling
        this.limit = limit; // child attribute
    }

    // Methods without return value - direct print - method do the output
    public void getLimit() {
        System.out.println("Limit available: " + limit + " CVE");
    }

}
