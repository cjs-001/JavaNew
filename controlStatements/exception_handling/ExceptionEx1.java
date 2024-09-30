package exception_handling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=1/0;
			
			
		}
		
		catch ( ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
		
		
		
		
	}

}
