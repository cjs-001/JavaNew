package collections_ex;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();
		
		hm.put(1, "charan");
		hm.put(2, "abhi");
		hm.put(3, "kannada");
		hm.put(3, "hindi");
		hm.put(0, "first");
		hm.put(3, "kannada");
		hm.put(4, "tamil");
		
		System.out.println(hm);
//		hm.put( 5, null);
		hm.put(5, "asd");
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.values());
		hm.replace(2, "abhi","abhishek");
		System.out.println(hm);
		
		Set<Integer> s = new HashSet<Integer>();
		s=hm.keySet();
		
		System.out.println(s);
		
		Enumeration k = hm.keys();
		
		
		while(k.hasMoreElements())
		{
			Object i =k.nextElement();
			String str1=hm.get(i);
			System.out.println(str1);
			
			if(i.equals(3))
			{
				System.out.println("inside");
				System.out.println(hm.get(3));
				System.out.println("outside");
			}
		}
		
		Iterator<String> it = hm.values().iterator();
		while(it.hasNext())
		{
			String value =it.next();
			System.out.println(value);
			
		}
		
		
		
		
	}

}
