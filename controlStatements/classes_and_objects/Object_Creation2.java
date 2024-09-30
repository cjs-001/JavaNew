package classes_and_objects;

public class Object_Creation2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		// TODO Auto-generated method stub

		a1 obj1 = new a1();
		b1 obj2 = (b1) obj1.clone();
		
		obj2.zxc();
		obj1.asd();
	}
	
	

}

class a1
{
	void asd()
	{
		System.out.println("class a");
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class b1
{
	void zxc()
	{
		System.out.println("class b");
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
