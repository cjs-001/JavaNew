package switchStatement;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String type = "Diamond";
		
		
		switch(type.toLowerCase())
		{
		case "": System.out.println("red");
		
		
		case "Average":
			
			int z=0;
			
			for(int j=1;j<=5;j++)
			{
				//System.out.println(j);
				z=z+j;
				
			}
			System.out.println(z);
			System.out.println(z/5);
			
			break;
			
		
		case "diamond":

			// TODO Auto-generated method stub
			
			for(int i=1;i<=5;i++)
			{
				for(int k=5;k>i;k--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<2*i-1;j++)
				{
					System.out.print("*");
					
				}
				System.out.println("");
			}
			
			for(int i=5;i>=1;i--)
			{
				for(int k=5;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<2*i-2;j++)
				{
					System.out.print("*");
					
				}
				System.out.println("");
			}

			System.out.println("qwertyj");
			break;
		
			
		
		case "multi":
			
			for(int j=1;j<=5;j++)
			{
				System.out.println("5 x "+j+"="+5*j);
				
				
			}
			
			;
		
	}

	}}
