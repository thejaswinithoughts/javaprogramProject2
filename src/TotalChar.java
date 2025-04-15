
public class TotalChar {

	public static void main(String[] args) {
		String s= "The best of both world";
		int Count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			Count++;
		}
System.out.println(Count);
	}

}
