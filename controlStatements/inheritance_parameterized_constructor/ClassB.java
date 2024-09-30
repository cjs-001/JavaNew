package inheritance_parameterized_constructor;

public class ClassB extends ClassA{
	
	int i;
	
	
	public ClassB(int a,int b) {
		// TODO Auto-generated constructor stub
		super(a);
		i=b;
		
	}
	
	void show() {
		
		System.out.println("sub class i = "+i);
		System.out.println("super class i = "+super.i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
