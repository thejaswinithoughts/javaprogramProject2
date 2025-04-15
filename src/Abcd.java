
public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Define input string
        String input = "abcd";
        
        // Variable to store output
        String output = "";
        
        // Loop through each character and append it twice using a for loop
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            //output =ch+output;---reversed
           output = output+ch;
            output = output+ch;
        }
        
        // Print the final output
        System.out.println("Output: " + output);
    }
	}


