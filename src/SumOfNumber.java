
public class SumOfNumber {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		
		

		while(num>0)
		{
			sum=sum+num%10;//to get last digit to sum
			num=num/10;
		}
		System.out.println(sum);
	}

}
