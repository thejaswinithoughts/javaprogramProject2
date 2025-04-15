import java.util.Arrays;
import java.util.List;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="My Name is Teju";
		
		String[] a=s.split(" ");
		//String[] a=s.split(" ").length();
		System.out.println(a);
		
		List<String> value=Arrays.asList(a);
		
		System.out.println(value);
		
		
		System.out.println(value.size());
	}
	
	

}
