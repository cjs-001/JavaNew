package ForStatement;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
