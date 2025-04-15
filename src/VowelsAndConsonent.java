
public class VowelsAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="maheshbabu";
int vCount=0;
int cCount=0;
int Count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ')
	{
		Count++;
	}

	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		vCount++;
	}
	
	else if(s.charAt(i)>'a' && s.charAt(i)<'z')
	{
		cCount++;
	}
	
	
}
System.out.println(Count);
System.out.println(vCount);
System.out.println(cCount);
	}

	}


