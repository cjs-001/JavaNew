package Arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="race";
		String b="care";
		
		System.out.println(a.compareTo(b));
		
		
		if (a.length()==b.length())
		{
			
			char[] x=a.toCharArray();
			char[] z=b.toCharArray();
			
			Arrays.sort(z);
			Arrays.sort(x);
			
			
			
			if((Arrays.equals(x, z))==true)
			{
				System.out.println("done");
			}
		
		}
	}

}
