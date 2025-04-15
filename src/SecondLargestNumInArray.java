import java.util.Arrays;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
	
		int a[]= {3,5,2,6,7,7,9,4};
		Arrays.sort(a); 
		
		int size=a.length; //
		
		//System.out.println(a[size-2]);
		
		for(int i=size-2;i>=0;i--)
		{
			if(a[i]!=a[size-1])
			{
				System.out.println(a[i]);
				return;
			}
		}
	}

}
