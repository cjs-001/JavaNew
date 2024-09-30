package Arrays;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a=new int[2][3];
		
		//System.out.println(args.length);
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				a[i][j]=j;
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
