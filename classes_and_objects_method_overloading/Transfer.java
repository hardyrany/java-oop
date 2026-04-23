package classes_and_objects_method_overloading;

/* Method Overloading
   Same name, different parameters (compile-time polymorphism).
*/

public class Transfer {

   /*
    * Method with no return value
    * And one parameter
    */
   public void transfer(double value) {
      System.out.println("Transferring " + value + " CVE");
   }

   /*
    * Method with no return value
    * And two parameter
    */
   public void transfer(double value, String description) {
      System.out.println("Transferring " + value + " CVE | " + description);
   }
}
