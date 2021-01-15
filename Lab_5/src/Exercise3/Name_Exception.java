package Exercise3;

public class Name_Exception extends Exception{
	String message;
	public Name_Exception() {
	}
	public void NameException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}

}
