package collections_ex;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("charan");
		ls.add("charan");
		ls.add("giri");
		ls.add("abhi");
		ls.remove("charan");
		ls.add(null);
		ls.add(null);
		
		System.out.println(ls);
		
		Iterator<String> it = ls.iterator();
		 
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}

		ls.remove("charan");
	}

}
