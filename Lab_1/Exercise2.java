import java.util.Scanner;

public class Exercise2 {

	String s;
	public void signalIndicator(String s) {
		if(s.equals("red")) {
			System.out.println("stop");
		}else if(s.equals("green")) {
			System.out.println("go");
		}else if(s.equals("yellow")){
			System.out.println("ready");
		}else {
			System.out.println("No message shown");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exercise2 exercise2=new Exercise2();
		System.out.println("Enter the String");
		String str=sc.next();
		exercise2.signalIndicator(str);

	}

}
