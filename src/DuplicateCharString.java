
public class DuplicateCharString {

	public static void main(String[] args) {
		
		String s="maheshbabu";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate Element Found:"+ch[j]);
					
				}
			}
		}

	}

}
