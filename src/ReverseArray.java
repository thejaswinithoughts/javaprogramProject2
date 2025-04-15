import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
	int arr[]= {4,6,7,3,8};
	
	int start=0;//start index is 0
	int last=arr.length-1;//last index
	int temp;//temp for revers the element
	
	while(start<last)
	{
		temp=arr[start];
		arr[start]=arr[last];
		arr[last]=temp;
		start++;
		last--;
	}
	
	System.out.println(Arrays.toString(arr));

	}

}
