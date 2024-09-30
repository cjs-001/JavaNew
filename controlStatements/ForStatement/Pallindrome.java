package ForStatement;

public class Pallindrome {

	public static void main(String[] args) {
		
		
		String asd = "malayalam";
		String reverse="";
		
		for(int i=asd.length()-1;i>=0;i--)
		{
			char chr1=asd.charAt(i);
			reverse = reverse+chr1;
			//System.out.print(asd.charAt(i));
		}
		if (asd.equalsIgnoreCase(reverse))
			System.out.println("is palindrome");
		else
		System.out.println("not a palindrome");
		System.out.println(reverse);	
		
		
	
	
	}
}
