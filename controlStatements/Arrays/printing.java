package Arrays;

public class printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[10][10];  
		System.out.println(a.length);
		
		for(int b=a.length;b>1;b--)
		{
			for(int c=a.length;c>1;c--)
			{
				System.out.print("-");
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
