
public class ConstructorOverloading {
	
	 ConstructorOverloading(int a,int b)
	{
		System.out.println("Hi");
	}

	ConstructorOverloading(int b,char c)
	{
		System.out.println("hello");
	}
	
	 ConstructorOverloading(char a,int b)
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		new ConstructorOverloading(6,8);
		new ConstructorOverloading(7,'k');
		new ConstructorOverloading('h',7);
		
		
		
	}

}
