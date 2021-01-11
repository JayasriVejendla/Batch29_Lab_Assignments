import java.util.Scanner;

public class Exercise6 {
	int n;
	public int calculateSquaresum(int n) {
		int square=0;
		int sum1=0;
		for(int i=1;i<=n;i++) {
			square=i*i;
			sum1=sum1+square;
		}
		return sum1;
	}
	public int calculateSum(int n) {
		int sum2=0;
		for(int i=1;i<=n;i++) {
			sum2=sum2+i;
		}
		return sum2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exercise6 exercise6=new Exercise6();
		System.out.println("Enter the range");
		int num=sc.nextInt();
		int res1=exercise6.calculateSquaresum(num);
		int res2=exercise6.calculateSum(num);
		int diff=res1-(res2*res2);
		System.out.println(Math.abs(diff));

	}

}








