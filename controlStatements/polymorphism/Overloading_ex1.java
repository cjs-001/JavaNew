package polymorphism;

public class Overloading_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(null);
		display(0, 0);
		display(null, 0);
	}
	
	private static void display(int b,String a)
	{
		
	}
	
	private static void display(float b,String a)
	{
		
	}
	
	static void display(int a, int b)
	{
		System.out.println("method1");
	}
	
	static void display(String a, int b)
	{
		System.out.println("method2");
	}

	static void display(String a)
	{
		System.out.println("method3");
	}
	
//	static String display(String a)
//	{
//		System.out.println("method3");
//		return a;
//	}
}
