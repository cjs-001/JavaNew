package classes_and_objects;

public class Instance_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex obj1,obj2;
		obj1 =new ex();
		obj2 =new ex();
		
		++obj1.x;
		obj1.display();
		--obj2.x;
		obj2.display();
	}

}

class ex{
	
	int x=10;
	void display()
	{
		System.out.println(x);
	}
	
	
}
