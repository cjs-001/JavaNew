package method_overriding;

public class ClassB extends ClassA{
	
	void display(int a)
	{
		System.out.println("classB");
	}

	void display2(int a,int b,int c)
	{
		System.out.println("classB");
		
	}
	
	static void display2(int a,int b)
	{
		System.out.println("classB");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
