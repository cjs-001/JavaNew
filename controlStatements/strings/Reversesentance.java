package strings;

public class Reversesentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "I love India";
		
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
			for(int j=b[i].length()-1;j>=0;j--)
			{
				System.out.print(b[i].charAt(j));
				
			}
			System.out.print(" ");
		}
				
				
		
	}

}
