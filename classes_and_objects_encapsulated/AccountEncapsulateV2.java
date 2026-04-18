package classes_and_objects_encapsulated;

public class AccountEncapsulateV2 {
    public static void main(String[] args) {

        // Create objects
        Account account1 = new Account("Maria", 50000);
        Account account2 = new Account("Pedro", 100000);

        // Calling objects and methods
        System.out.println(account1.getTitular() + ": " + account1.getBalance() + " CVE");
        System.out.println(account2.getTitular() + ": " + account2.getBalance() + " CVE");
    }
}
