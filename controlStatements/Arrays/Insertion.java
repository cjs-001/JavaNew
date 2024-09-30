package Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			if(i==2)
			{
				arr[i+1]=arr[2];
				arr[2]=0;
			}
			
			System.out.println(arr[i]);
		}
		
	}

}
