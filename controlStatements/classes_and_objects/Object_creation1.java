package classes_and_objects;

import java.text.NumberFormat;

public class Object_creation1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class c =Class.forName("a");
		a s=(a) c.newInstance();
		s.asd();
	}

}

class a
{
	void asd()
	{
		System.out.println("class a");
	}
}

class b
{
	void zxc()
	{
		System.out.println("class b");
	}
}
