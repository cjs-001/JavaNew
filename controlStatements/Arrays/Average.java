package Arrays;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		
		int sum=0;
		
		for(int a:numbers)
		{
			sum=sum+a;
			
			
		}
		System.out.println(sum/numbers.length);
		
		for(int a:numbers)
		{
			if(a==30)
			{
				System.out.println("true");
			}
			
			
		}
		
		
		
	}

}
