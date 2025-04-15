
public class SwapWithoutTemp {

	public static void main(String[] args) {
		String a="aaa";
		String b="bbb";
		String temp;
		System.out.println(a+"   "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+"   "+b);
	}

}

