package exception_handling;

public class User_defined_exceptions extends Exception {
	
	
	private static int[] accno= {1001,1002,1003,1004,1005};
	
	private static String name[] = {"charan","girish","abhi","sachin","ullas"};
	
	private static double bal[] = {1223.12,4532.24,9875.34,3421.65,345.99};
	
	
	public User_defined_exceptions(String str) {
		// TODO Auto-generated constructor stub
		
		super(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
		
		for(int i=0;i<5;i++)
		{
			System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
			if(bal[i]<1000)
			{
				User_defined_exceptions ex= new User_defined_exceptions("balance is less");
				throw ex;
			}
			
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
