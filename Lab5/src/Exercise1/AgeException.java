/**Validate the age of a person and 
 * display proper message by using user defined exception Age of a person 
 * should be above 15
 * @author Jayasri Vejendla
 * 
 */
package Exercise1;
import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	try {
		System.out.println("Enter the age : ");
		int age= sc.nextInt();
		if(age<15){
			throw new Exception("You are under aged person");
		}
		System.out.println("Your age is more than 15");
		
	}catch(Exception e) {
		System.out.println("you are under aged person");
	}
			

	}

}
