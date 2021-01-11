import java.util.Scanner;

public class Exercise3 {
	int n1;
	int n2;
	int count;
	public void nonRecursive(int n1,int n2, int count) {
		for(int i=2;i<count;++i) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	void recursive(int count,int n1,int n2) {
		if(count>0) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			recursive(count-1,n1,n2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exercise3 exercise3=new Exercise3();
		System.out.println("Enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count1=sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		exercise3.nonRecursive(num1, num2, count1);
		System.out.println(num1);
		System.out.println(num2);
		exercise3.nonRecursive(count1-2, num1, num2);

	}

}








