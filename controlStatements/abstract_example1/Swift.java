package abstract_example1;

public class Swift extends Car {

	public Swift(int regno) {
		super(regno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	void regno()
	{
		System.out.println(regno);
	}

	@Override
	void fueltype() {
		// TODO Auto-generated method stub
		System.out.println("diesel car");
	}

	@Override
	void gearsystem() {
		// TODO Auto-generated method stub
	
		System.out.println("automatic gear sysytem");
	}

}
