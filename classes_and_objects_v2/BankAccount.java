package classes_and_objects_v2;

public class BankAccount {
    public static void main(String[] args) {

        Account account1 = new Account("Hardy", 120000);
        Account account2 = new Account("Merly", 550544);

        account1.getBalance();
        account2.getBalance();
    }
}
