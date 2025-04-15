
public class ReverseString {

	public static void main(String[] args) {
		String original = "thejaswini";
		String reversed = "";
		char ch;
		for(int i=0;i<original.length();i++)
		{
			ch=original.charAt(i);
			reversed=ch+reversed;
		}
			System.out.println(reversed);
		}

	}


