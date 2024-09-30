package streams_java;

import java.util.Arrays;
import java.util.stream.Stream;

public class MappingAndSorting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.of("abhishek","charan","sachin","girish","abhay").filter(s->s.endsWith("n"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//sorting
		
		Stream.of("abhishek","charan","sachin","girish","abhay").sorted()
		.forEach(s->System.out.println(s));
		
		
		//sorting without streams 
		String[] str= {"abhishek","charan","sachin","girish","abhay"};
		Arrays.sort(str);
		for(String sort:str)
		{
			System.out.println(sort);
		}
	}

}
