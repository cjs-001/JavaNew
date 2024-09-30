package strings;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mom";
		
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			char s=a.charAt(i);
			b=b+s;
			
			
		}
		
		if(a.equals(b))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
		
		System.out.println(b);
		
	}

}
