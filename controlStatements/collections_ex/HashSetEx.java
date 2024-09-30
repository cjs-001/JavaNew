package collections_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet<String> hs1 = new HashSet<String>();
		
		HashSet<String> hs2 = new HashSet<String>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(null);
		hs.add(null);
		
		hs1.add("charan");
		hs1.add("giri");
		hs1.add("malli");
		hs1.add(null);
		
		
	    hs.size();
		
		System.out.println(hs.size());
		System.out.println(hs.contains(45));
		hs.clear();
		System.out.println(hs.isEmpty());
		hs2.addAll(hs1);
		System.out.println(hs2.containsAll(hs2));
		System.out.println(hs1.isEmpty());
		System.out.println(hs2.isEmpty());
		
		
		System.out.println(hs2);
		
		
	    Iterator<Integer> li = hs.iterator();
			
		while(li.hasNext())
		{
			int i = li.next();
			System.out.println(i);
		}
		
		Object[] str =  hs2.toArray();
		
		for(Object str1:str)
		{
			System.out.println(str1);
		}
		

	}

}
