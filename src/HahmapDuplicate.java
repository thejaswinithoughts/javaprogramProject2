import java.util.HashSet;

public class HahmapDuplicate {

	public static void main(String[] args) {
		String arr[]= {"java","selenium","c","c++","java"};
		Boolean flag=false;
		HashSet hm = new HashSet();
		
		for(String s:arr) 
		{
		if(hm.add(s)==false)
		{
	    System.out.println("Duplicates found:"+s);
		flag=true;
		}
		}
	
if(flag==false)
{
System.out.println("Duplicates Not found");
	
	}


}
}