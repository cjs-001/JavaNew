package streams_java;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("abhishek");
		names.add("charan");
		names.add("sachin");
		names.add("girish");
		names.add("abhay");
		
		//we can also write above list as
		
		
		long cc=Stream.of("abhishek","charan","sachin","girish","abhay").filter(s->
		{
			s.startsWith("a");
			return true;
		}).count();
		System.out.println(cc);
		
		
		long c=names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
