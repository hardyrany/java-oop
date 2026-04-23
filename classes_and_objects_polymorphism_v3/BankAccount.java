package classes_and_objects_polymorphism_v3;

public class BankAccount {
    public static void main(String[] args) {
        
        Account account1 = new Account("Hardy", 50_000);
        Account account2 = new SavingAccount("Hardy", 25_000);
        Account account3 = new CreditAccount("Hardy", 10_000);

        System.out.println("====================");
        System.out.println("Titular: " + account1.getTitular() + "\nBalance: " + account1.getBalance() + " \nFee: " + account1.calculateFees());
        System.out.println("====================");
        System.out.println("Titular: " + account2.getTitular() + "\nBalance: " + account2.getBalance() + "\nFee: " + account2.calculateFees());
        System.out.println("====================");
        System.out.println("Titular: " + account3.getTitular() + "\nBalance: " + account3.getBalance() + "\nFee: " + account3.calculateFees());
        System.out.println("====================");
    }
}
