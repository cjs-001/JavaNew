package collections_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<Integer>();
		
		st.add(1);
		st.add(2);
		st.add(2);
		st.add(3);
		st.add(null);
		st.add(null);
		st.add(0);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		st.push(3);
		System.out.println(st);
		System.out.println(st.search(1));
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("your choice");
//		int choice = Integer.parseInt(br.readLine());
//		
//		switch(choice)
//		{
//		case 1: System.out.println(st);
//		
//		case 2: System.out.println(st.peek());
//		
//		case 3: System.out.println(st.indexOf(2));
//		
//		case 4: System.out.println(st.indexOf(3, 4));
//		}
	}

}
