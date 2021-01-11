import java.util.Scanner;

public class Exercise8 {
	int num1;
	public boolean chechPower(int num1) {
		boolean res=true;
		while(num1!=1) {
			if((num1%2)!=0) {
				res=false;
				break;
			}
			num1=num1/2;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise8 exercise8=new Exercise8();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean res2=exercise8.chechPower(num);
		if(res2==true) {
			System.out.println(num + " is power of 2");
		}else {
			System.out.println(num + " is not a power of 2");
		}

	}

}
