package collections_ex;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(1, "charan");
		hm.put(2, "abhi");
		hm.put(3, "kannada");
		hm.put(3, "hindi");
		hm.put(3, "kannada");
		hm.put(4, "tamil");
		
		System.out.println(hm);
		hm.put( 5, null);
		hm.put(5, "asd");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.values());
		hm.replace(2, "abhi","abhishek");
		System.out.println(hm);
		
		Set<Integer> s = new HashSet<Integer>();
		s=hm.keySet();
		
		System.out.println(s);
		
		
		
	for(Map.Entry<Integer, String> entry: hm.entrySet())
	{
		System.out.println(entry);
		
	}
	
	Iterator<Integer> it = hm.keySet().iterator();
	while(it.hasNext())
	{
		int key =it.next();
		System.out.println(key +"="+hm.get(key));
	}
		
	}
		

}
