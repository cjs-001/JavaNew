package collections_ex;

import java.util.Vector;

public class Vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		
		v.add("abhi");
		v.add("avilash");
		v.add("charan");
		v.add("chandu");
		v.add("charan");
		v.add(null);
		
		System.out.println(v);
		
		v.add(1, "kannada");
		v.addElement("hindi");
		v.add("tulu");
		
		System.out.println(v);
	}

}
