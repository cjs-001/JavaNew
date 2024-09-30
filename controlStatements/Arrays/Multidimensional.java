package Arrays;

import java.util.Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][][] = {{{1,2,3},{3,2,1}},
				       {{4,5,6},{6,5,4}},
				       {{7,8,9},{9,8,7}}};
		
		//System.out.println(a.length);
		
		
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(a[i][j][k]);
					System.out.print(" ");
				}
				System.out.println();
				
				
			}
			System.out.println();
		}
	}

}
