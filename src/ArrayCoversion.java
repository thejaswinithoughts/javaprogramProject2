import java.util.Arrays;
import java.util.List;

public class ArrayCoversion {

	public static void main(String[] args) {
		String[] arr= {"one","two","three","four"};
		
		//convert array into arraylist
		List<String> name=Arrays.asList(arr);
		System.out.println(name);
	}

}
