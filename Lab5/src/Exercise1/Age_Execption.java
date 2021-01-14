package Exercise1;

public class Age_Execption extends Exception{
	String message;
	public void Age_Exception() {
		

	}
public void Age_Exception(String message) {
	this.message=message;
}
public String getMessage() {
	return this.message;
}
}
