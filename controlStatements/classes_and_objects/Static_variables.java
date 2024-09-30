package classes_and_objects;

public class Static_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex1 obj1,obj2;
		obj1 =new ex1();
		obj2 =new ex1();
		
		++obj1.x;
		obj1.display();
		--obj2.x;
		obj2.display();
	}

}

class ex1{
	
	static int x=10;
	void display()
	{
		System.out.println(x);
	}
	
	
}

