package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		int num2=1;
		int num=8;
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<num;i++)
		{
			int sum=num1 + num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
			
		}
				

	}

}
