package aaprograms;

public class Print_distinct_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub

		String str= "interview";
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			for(int j=0;j<str.length();j++)
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
			if(count==1)
			{
				System.out.println(str.charAt(i));
			}

			count=1;
			
			
		}
	

	}

}
