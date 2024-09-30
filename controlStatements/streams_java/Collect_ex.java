package streams_java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> newList=Stream.of("abhishek","charan","sachin","girish","abhay").sorted()
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		newList.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
		
		//distict number with sorted
		
		Stream.of(1,2,4,2,5).distinct().sorted().forEach(s->System.out.println(s));
		
		//get me the 2nd value
		int i=Stream.of(1,2,4,2,5).distinct().sorted().collect(Collectors.toList()).get(2);
		System.out.println(i);
		
	}

}
