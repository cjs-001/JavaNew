package IfElse;

public class IfElseStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int b=1;
		int c=2;
		int bigger;
		
		if(a>b)
		{
			bigger=a;
		}
		else 
		{
			bigger=b;
		}
		if (bigger<c)bigger=c;
		
		System.out.println(bigger);
	}

}
