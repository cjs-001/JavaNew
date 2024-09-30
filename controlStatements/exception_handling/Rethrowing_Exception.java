package exception_handling;


class A
{
	void method()
	{
		try {
			String str="hello";
			char ch = str.charAt(5);
		}
		
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(" plese check");
			//se.printStackTrace();
			throw se;
		}
	}
	
	
}

public class Rethrowing_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		//a.method();
		try
		{
			a.method();
		}
		catch(StringIndexOutOfBoundsException es)
		{
			System.out.println("i caught thrown excetion");
			System.out.println(es);
		}
	}

}
