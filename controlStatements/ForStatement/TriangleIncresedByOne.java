package ForStatement;

public class TriangleIncresedByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=0;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				//k=k+1;
				System.out.print(k++);
			}
			System.out.println("");
		}
	}

}
