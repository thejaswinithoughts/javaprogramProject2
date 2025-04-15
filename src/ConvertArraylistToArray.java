import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylistToArray {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        
        System.out.println(arr);
        
        // Convert ArrayList to Array
        String[] array = arr.toArray(new String[0]);
        
        // Print the Array
        System.out.println("Array: " + Arrays.toString(array));

	}

}
