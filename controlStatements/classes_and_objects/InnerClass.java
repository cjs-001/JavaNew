package classes_and_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




	
class Bankacc
{
	private double bal;
	
	 Bankacc(double b) {
		bal=b;
	}
	 
	 void contact(double r) throws IOException
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter password");
		 String password=br.readLine();
		 if (password.equals("12345"))
		 {
			interest in=new interest(r); 
			in.calculateinterest();		
		 }
		 else
		 {
			 System.out.println("incorrect password");
		 }
	 }
	 
private class interest
{
	private double rate;
	
	 interest(double r) {
		rate=r;
	}
	 
	 void calculateinterest()
	 {
		 double interest=bal*rate/100;
		 bal=bal+interest;
		 System.out.println("balance = "+bal);
	 }
}
}

public class InnerClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Bankacc acc=new Bankacc(1000);
		acc.contact(9.5);
		
		
	}
}
	

