package inheritance_protected_specifiers;

public class Rectangle extends Square{

	private int j;
	
	public Rectangle(int i,int j) {
		
		
		super(i);
		this.j=j;
		
	}
	
	void area()
	{
		System.out.println("area of rectangle = "+ (i*j));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
