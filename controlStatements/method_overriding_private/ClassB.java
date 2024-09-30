package method_overriding_private;

public class ClassB extends ClassA{
	
	private void display(int a)
	{
		System.out.println("classB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB b= new ClassB();
		b.display(0);
	}

}
