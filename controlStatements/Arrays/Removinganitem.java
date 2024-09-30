package Arrays;

import java.util.Arrays;

public class Removinganitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		
		
		 for (int i = 5; i < my_array.length - 1; i++) {
	            my_array[i] = my_array[i + 1];
	            System.out.println(my_array[i]);
	        }
		 
		 
		
		 System.out.println("After removing the second element: " + Arrays.toString(my_array));
	}

}
