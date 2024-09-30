package interface_example1;

public interface Printer {
	
	void printit (String txt);
	
	void disconnect();
	
	 int i=0;
	
	static void printit2 (String txt)
	{
	 
		System.out.println("static method in interface");
	}
	
	default void printit3 ()
	{
	 
		System.out.println("default method in interface");
	}

}
