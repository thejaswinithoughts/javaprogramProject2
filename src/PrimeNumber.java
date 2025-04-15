// number>1 and num/num
public class PrimeNumber {

	public static void main(String[] args) {

		int num =3;
		int Count=0;
String s="Thej";

		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					Count++;
			}
			if(Count==2)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("not a Prime");
			}
		}
		else
		{
			System.out.println("Not a Prime");
		}

	}

}
