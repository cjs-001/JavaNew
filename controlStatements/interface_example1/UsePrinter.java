package interface_example1;

public class UsePrinter {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Printer printer = new IBMPrinter();
		
		printer.printit("printed");
		printer.disconnect();
		Printer.printit2(null); //calling using classname.staticmethodname
	    printer.printit3();
	    
	    IBMPrinter ibm = new IBMPrinter();
	    ibm.printit2(null);
		ibm.printit3();
		
		Class c = Class.forName("IBMPrinter");
		printer=(Printer) c.newInstance();
		printer.printit("printed using different object");
		printer.disconnect();
	}

}
