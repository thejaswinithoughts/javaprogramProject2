
public class MethodOverloading {
	//non static method
	void add(int a,int b)
	{
		System.out.println("first statment");
	}
	
	//static method
	static void add(double a,char b)
	{
		System.out.println("second statment");
	}
	
	//static method
	static void add(char a,int b)
	{
		System.out.println("third statment");
	}
	
	//non static method
	void add(int a,double b)
	{
		System.out.println("forth statment");
	}
	

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(5,9);//first statement
		
		add(12.8,'a');//second statement
		
		add('s',8);//third
		
		mo.add(8,8.96);//forth
		
		

	}

}
