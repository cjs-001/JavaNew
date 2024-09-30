package constructors;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex2 ex=new ex2("parameterized constructor");
		ex.asd();

	}

}


class ex2
{
	
	public ex2()
	{
		System.out.println("default constructor");
	}
	
	public ex2(String a)
	{
		System.out.println(a);
	}
	
	public static void asd()
	{
		System.out.println("this is method");
	}
}
