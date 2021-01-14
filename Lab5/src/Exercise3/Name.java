/**Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 * @author Jayasri Vejendla
 *
 */
package Exercise3;

import java.util.Scanner;

public class Name {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the First name: ");
			String firstname=sc.nextLine();
			System.out.println("Enter the last name: ");
			String lastname=sc.nextLine();
			if(firstname.equals("") && lastname.equals("")) {
				throw new Exception("first name and last name can not be blank");
			}
			else {
				System.out.println(firstname+" "+lastname);
			}
		}catch(Exception e) {
			System.out.println("First name and last name can not be blank");
			
		}
		

	}

}
