package Arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456
	        };
		
		 String[] my_array2 = {
		            "Java",
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++",
		            "C!"
		        };
		
		int my[] = new int[3];
		my[0]= 0;
		my[1]=1;
		my[2]=2;


		
		
		Arrays.sort(my_array1);
		Arrays.sort(my_array2);
		System.out.println(Arrays.toString(my_array1));
		System.out.println(Arrays.toString(my_array2));
	}

}
