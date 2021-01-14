/**Create an Exception class named as “EmployeeException"
 * and throw an exception if salary of an employee is below than 3000. 
 * Use Exception Handling mechanism to handle exception properly.
 * 
 * @author Jayasri Vejendla
 * 
 */
package Exercise2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee y=new Employee();
		try {
			System.out.println("Enter the Salary:");
			double salary=sc.nextDouble();
			if(salary<=3000) {
				throw new Exception("Salary is not less than 3000");
			}
			else
			{
				System.out.println("Salary accepted");
			}
		}
			catch(Exception e) {
				System.out.println("Salary is not less than 3000");
			}

	}
}
