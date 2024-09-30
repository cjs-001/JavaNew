package collections_ex;

import java.util.LinkedList;

public class LinkedList_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(3);
		ll.add(7);
		ll.add(9);
		ll.add(5);
		ll.add(3);
		ll.add(null);
		ll.add(null);
		ll.add(1, 2);
		ll.addFirst(0);
		ll.addLast(9);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.indexOf(1));
		
		Object[] i= ll.toArray();
		
		for(Object u:i)
		{
			System.out.println(u);
		}
		

	}

}
