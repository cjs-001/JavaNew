package collections_ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = {1,6,7,3,4,9,0};
		
		System.out.println("ascending order");
		Arrays.sort(i);
		
		
		for(int j:i)
		{
			System.out.print(j);
		}
		System.out.println();
		System.out.println("descending order");
		for(int o=i.length-1;o>=0;o--)
		{
			System.out.print(i[o]);
		}
		System.out.println();
		
		int[] j = {1,6,7,3,4,9,0};
		int[] z = {1,6,7,3,4,9,0};
		Arrays.sort(j, 0, 3);
		int g=Arrays.binarySearch(j, 9);
		System.out.println(Arrays.equals(z, j));
		Arrays.fill(j, 9);
		System.out.println(j.length);
		
		System.out.println(g);
		for(int k:j)
		{
			System.out.print(k);
		}
		
	}

}
