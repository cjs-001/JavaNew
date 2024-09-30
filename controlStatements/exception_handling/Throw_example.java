package exception_handling;

public class Throw_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			throw new NullPointerException("thowing exception");
			
			
		}
		
		catch ( NullPointerException ex)
		{
			System.out.println(ex);
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
		
		
		
		
	}

}
