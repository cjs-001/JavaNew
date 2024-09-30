package interface_example1;

public class IBMPrinter implements Printer {

	@Override
	public void printit(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt);
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("printing completed");
		System.out.println("disconnected from IBM printer");
	}
	
	static void printit2 (String txt)
	{
	 
		System.out.println("static method in IBMPrinter class");
	}
	
	 public void printit3 ()
	{
	 
		System.out.println("default method in IBMPrinter class");
	}

}
