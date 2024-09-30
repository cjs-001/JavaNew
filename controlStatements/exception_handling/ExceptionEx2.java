package exception_handling;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// only first exception will be caught in catch block
		
		try
		{
			int a=1/0;
			String[] str = new String[3];
			str[20]="str";
			
		}
		
		catch ( ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
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
