//range is 10 
//0,1,   1,2,3,5,8,13,21,34
public class Fibonacci {

	public static void main(String[] args) {
		
	int n1=	0, n2=1, sum=0;
	

	for(int i=2;i<10;i++)
	{
		sum=n1+n2; //2+5=7
		System.out.println(" "+sum);
		n1=n2; //5
		n2=sum;//7
	}
	} 

}
