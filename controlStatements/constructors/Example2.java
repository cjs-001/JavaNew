package constructors;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex obj = new ex("charan", 26);
		obj.check();
	}

}

class ex{
	
	private String name;
	private int age;
	
	ex(String s,int i)
	{
		name=s;
		age=i;
	}
	
	void check()
	{
		System.out.println(name);
		System.out.println(age);
	}
}