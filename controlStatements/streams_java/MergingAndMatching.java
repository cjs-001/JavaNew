package streams_java;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MergingAndMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<String> names1 = new ArrayList<String>();
		
		names1.add("abhishek");
		names1.add("charan");
		
		
ArrayList<String> names2 = new ArrayList<String>();
		
        names2.add("sachin");
		names2.add("girish");
		names2.add("abhay");
		
		Stream merged=Stream.concat(names1.stream(), names2.stream());
		merged.sorted().forEach(s->System.out.println(s));
		
		//matching
		
		boolean asd=names2.stream().anyMatch(s->s.equalsIgnoreCase("girish"));
		
		System.out.println(asd);
	}

}
