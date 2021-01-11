
public class Exercise1 {

	int num=123;
	public void cubeOfNumber() {
		int sum=0;
		while(num!=0){
			int rem=num%10;
			int result=rem*rem*rem;
			sum=sum+result;
			num=num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 exercise1=new Exercise1();
		exercise1.cubeOfNumber();

	}

}
