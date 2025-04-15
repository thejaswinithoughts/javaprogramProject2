import java.util.Arrays;

public class MoveZeroToRight {

	public static void main(String[] args) {
		int a[]= {1,5,7,0,4,0};
		
int temp;

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;i<a.length;j++)
	{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
	}
System.out.println(Arrays.toString(a));
	}

}
