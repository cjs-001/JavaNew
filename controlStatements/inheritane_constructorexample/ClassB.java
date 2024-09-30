package inheritane_constructorexample;

public class ClassB extends ClassA {
	
	public ClassB() {
		// TODO Auto-generated constructor stub
		System.out.println("classB");
	}
	
	int a=10;
	ClassB(int a)
	{
		System.out.println(this.a=a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
