package ForStatement;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "my name is tom";
		
		StringBuffer rev = new StringBuffer("kannada");
		System.out.println(rev.reverse());

		String[] result = name.split(" ");
			
			int a = result.length;
			
			for(int i=0;i<a;i++)
			{	
				char[] abc = result[i].toCharArray();
				//System.out.println(result[i]);
				for(int j= abc.length-1; j>=0 ;j--)
			{
				
				System.out.print(abc[j]);
				

			}
				System.out.print(" ");
			}
		
	}

	

}
