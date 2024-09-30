package interface_example1;

public class EpsonPrinter implements Printer {

	@Override
	public void printit(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt);
	}
	
	

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("printing completed");
		System.out.println("disconnected from Epson printer");
	}

}
