package aaprograms;

import java.util.HashMap;
import java.util.Map;

public class Print_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "interview";
		int count=1;
		int i=0;
		int j=0;
		int k=0;
		
		Map<Character, Integer> asd = new  HashMap();
		
		for(i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			for(j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					char ss= str.charAt(j);
					if(ch==ss)
					{
						count+=count++;
						
					}
				}
			}
			
			asd.put(str.charAt(i), count);
			count=1;
		}
		
		System.out.println(asd.toString());
	}

}
