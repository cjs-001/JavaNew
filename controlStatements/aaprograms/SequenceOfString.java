package aaprograms;

public class SequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="myindia";
		String b="mydi";
		
		for(int i =0;i<=a.length()-1;i++)
		{
			for(int j=0;j<b.length()-1;j++)
			{
				if(a.charAt(i)==b.charAt(j)&&a.charAt(i+1)==b.charAt(j+1))
				{
					System.out.println("true");
				}
			}
		}
		
	}

}
