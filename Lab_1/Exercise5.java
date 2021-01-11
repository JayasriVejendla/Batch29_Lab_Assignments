import java.util.Scanner;

public class Exercise5 {
	int n;
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exercise5 exercise5=new Exercise5();
		System.out.println("Enter the range");
		int num=sc.nextInt();
		System.out.println(exercise5.calculateSum(num));

	}

}
