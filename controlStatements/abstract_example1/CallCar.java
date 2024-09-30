package abstract_example1;

public class CallCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Santro santro = new Santro(12345);
		santro.regno();
		santro.fueltype();
		santro.gearsystem();
		santro.seatno();
		
		Swift swift = new Swift(54321);
		swift .regno();
		swift.fueltype();
		swift.gearsystem();
		swift.seatno();
		
		Car ref = new Santro(12345);
		ref.regno();
		ref.fueltype();
		ref.gearsystem();
		ref.seatno();
	}

}
