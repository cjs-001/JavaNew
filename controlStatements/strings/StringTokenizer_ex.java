package strings;

import java.util.StringTokenizer;

public class StringTokenizer_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my name is charan";
		
		StringTokenizer asd = new StringTokenizer(str," ");
		
		
    
		while(asd.hasMoreTokens())
		{
			System.out.println(asd.nextToken());
		}
		
		String str1 = "Hi, my name is charan. what is your name?";

		StringTokenizer asd1 = new StringTokenizer(str1,",.");
		while(asd1.hasMoreTokens())
		{
			System.out.println(asd1.nextToken());
		}
	}

}
