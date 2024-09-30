package collections_ex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> al= new ArrayList<Double>();
		
		al.add(1.2);
		al.add(1.1);
		al.add(1.3);
		al.add(1.4);
		al.add(1.5);
		al.add(1.1);
		al.add(null);
		
		System.out.println(al);
		al.add(1, 1.2);
		System.out.println(al);
		al.set(1, 1.9);
		System.out.println(al);
		
		ListIterator<Double> li = al.listIterator();
	
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
	}

}
