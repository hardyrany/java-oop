package classes_and_objects_method_overloading_v2;

/* Method Overloading
   Same name, different parameters (compile-time polymorphism).
*/

class Transfer {

   // Instance variables
   double value;
   String description;
   
   // Constructor
   public Transfer(double value, String description) {
      this.value = value;
      this.description = description;
   }

   /*
    * Method with no return value
    * And one parameter
    */
   public void getTransfer(double value) {
      System.out.println("Transferring " + value + " CVE");
   }

   /*
    * Method with no return value
    * And two parameter
    */
   public void getTransfer(double value, String description) {
      System.out.println("Transferring " + value + " CVE | " + description);
   }

   @Override
   public String toString() {
      return "Transfer{value=" + value + ", description='" + description + "'}";
   }
}

public class TransferV2 {
   public static void main(String[] args) {
      
      // In main, use overloaded methods
      Transfer transfer1 = new Transfer(50000, "Payment");
      transfer1.getTransfer(20_000);
      transfer1.getTransfer(30_000, "Payment");
   }
   
}
