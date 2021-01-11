import java.util.Scanner;

public class Exercise7 {

	public boolean increaingNumber(int n) {
		boolean res=true;
		int current=n%10;
		n=n/10;
		while(n!=0) {
			if(current<=n%10) {
				res=false;
				break;
			}
			current=n%10;
			n=n/10;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Exercise7 exercise7=new Exercise7();
		int number=sc.nextInt();
		boolean x=exercise7.increaingNumber(number);
		System.out.println(x);

	}

}
