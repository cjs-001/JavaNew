package Arrays;

public class minandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num[]=new int[4];
		num[0]=11;
		num[1]=3;
		num[2]=9;
		num[3]=10;
		
		
		int b=0;
		//int c=0;
		int min = 0;
		for(int a=0;a<num.length;a=a+2)
		{
			if(num[a]>b)
			{
				b=a;
			}
			
			
			if(num[a]<num[a+1])
			{
				min=num[a];
			}
		
		}
		System.out.println(b);
		System.out.println(min);
	}

}
