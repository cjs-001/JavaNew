package abstract_example1;

public class Santro extends Car {

	public Santro(int regno) {
		super(regno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	void wings() {
		System.out.println("this car has wings");
	}
	
	void regno()
	{
		System.out.println(regno);
	}

	@Override
	void fueltype() {
		// TODO Auto-generated method stub
		System.out.println("petrol car");
	}

	@Override
	void gearsystem() {
		// TODO Auto-generated method stub
		System.out.println("manual gear system");
		
	}

}
