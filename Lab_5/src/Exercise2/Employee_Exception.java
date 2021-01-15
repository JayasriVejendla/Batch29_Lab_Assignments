package Exercise2;

public class Employee_Exception extends Exception{
   String message;
   public Employee_Exception() {
	   
   }
   public Employee_Exception(String message) {
	   this.message=message;
   }
   public String getMessage() {
	   return this.message;
   }

}
